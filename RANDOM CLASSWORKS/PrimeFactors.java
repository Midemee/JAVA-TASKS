/*PSEUDOCODE
TOP LEVEL
Collect input from user and print sum of it's prime factors
prime factors are numbers that divide without any remainder

STEP-WISE REFINEMENT
First, collect input from user
loop through the number and start division
check if its divisible by 2 and with no remainder*/

import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner inputEntry = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = inputEntry.nextInt();
    
        int primeNumber = 0;
        int divide = 0;
        int sum = 0;
        
        for (int number = 2; number <= userInput; number++) {

            
            for (int counter = 1; counter <= number; counter++) {
                if (number % counter == 0) {
                    divide += 1;
                }
            }
                             
            if (divide == 2) {
                System.out.print(number + " "); 
                primeNumber++;
                sum += primeNumber;    
            }

        }
            System.out.printf("The sum is: %d", sum);
    }
}


               /* if (primes % 8 == 0) {
                    System.out.println(); 
                }*/







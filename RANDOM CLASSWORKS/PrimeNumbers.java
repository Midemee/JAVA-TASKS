/*PSEUDOCODE
TOP LEVEL
Collect input from user and print sum of it's prime factors
prime factors are numbers that divide without any remainder

STEP-WISE REFINEMENT
Collect Input: Ask the user for a number 
Declare variable sum and initialise to zero 
While userinput is divisible by 2
add 2 to the sum and divide by 2 again
remaining the odd factors that cant be divided by 2
Handle Odd Factors: Start a loop from
up to*/




import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    int sum = 0;

    int count = 2;

     while (count <= number) {
        if (number % count == 0) {
            number = number / count;
            sum = sum + count;
          }
          else{

            count++;

          }
     }

//      for (int count = 2; count <= number;) {
//          if (number % count == 0) {
//            number = number / count;
//            sum = sum + count;
//          }
//          else
//
//            count++;
//
//          }
//         
//      }

    System.out.print(sum);
    
    }
}


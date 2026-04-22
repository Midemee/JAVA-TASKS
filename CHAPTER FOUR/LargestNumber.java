/* 4.21
PSEUDOCODE
TOP lEVEL
A program that collects 10 integers and determines which is the largest the prints out

STEP WISE REFINEMENT
create a loop that runs 10 times
collect user input
declare a variable largest and initialise to 0
if useriput is greater than largest
new largest is useriput
print out the largest*/

import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
    Scanner inputEntry = new Scanner(System.in);
    int largest = 0;
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter a number: ");
            int number = inputEntry.nextInt();

            if (number > largest) {
                largest = number;
            }   
        }
        System.out.printf("Largest number is: %d", largest);  
    }

}


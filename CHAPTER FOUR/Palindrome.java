/*4.31 (Palindromes) A palindrome is a sequence of characters that reads the same backward as for-
ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a pal-
indrome. If the number is not five digits long, display an error message and allow the user to enter
a new value.*/

import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner inputEntry = new Scanner(System.in);

        int number = 0;
        //while(number < 10000 || number > 99999)
        while (true){
            System.out.print("Enter a five-digit number: ");
            number = inputEntry.nextInt();
            if(number < 10000 || number > 99999){
                System.out.print("Invalid! Enter a five-digit number: ");
            }
            else{
                break;
            }

        }

        int firstStep = number % 10;
        number /= 10;
        int secondStep = number % 10;
        number /= 10;
        int thirdStep = number % 10;
        number /= 10;
        int fourthStep = number % 10;
        number /= 10;
        int fifthStep = number % 10;


        if (firstStep == fifthStep && secondStep == fourthStep) {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }

    }

}

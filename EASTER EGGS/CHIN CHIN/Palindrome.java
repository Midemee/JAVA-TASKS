import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a three-digit number: ");
	int number = input.nextInt();
    if (number < 100 || number > 999) {
    	System.out.print("Invalid! Enter a three-digit number: ");
        return;
    }

	int units = number % 10;
    number /= 10;
    int tens = number % 10;
    number /= 10;
    int hundreds =  number % 10;
    

	if (units == hundreds) {
	System.out.println("The number is a palindrome");
	}
	else {
	System.out.println("The number is not a palindrome");
	}
    }
} 

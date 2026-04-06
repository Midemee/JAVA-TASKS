import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a three-digit number: ");
	int number = input.nextInt();

	int hundreds = number / 100;
	int tens = number / 10;

	if (hundreds == tens) {
	System.out.println("The number is a palindrome");
	}
	else {
	System.out.println("The number is not a palindrome");
	}
    }
} 
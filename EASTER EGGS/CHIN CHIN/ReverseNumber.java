import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a four-digit number: ");
	int number = input.nextInt();

	int stepOne = number / 1000;
	int stepTwo = (number / 100) % 10;
	int stepThree = (number / 10) % 10;
	int stepFour = number % 10;

	int reverse = stepFour + stepThree + stepTwo + stepOne;

	System.out.printf("The result is %d", reverse);

    }
} 
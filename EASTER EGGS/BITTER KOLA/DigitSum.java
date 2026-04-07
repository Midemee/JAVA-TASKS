import java.util.Scanner;
public class DigitSum{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a 5-digit integer: ");
	int number = input.nextInt();
	
	int firstDigit = number / 10000;
	int lastDigit = number % 10;

	int sum = firstDigit + lastDigit;

	System.out.printf("The sum is %d", sum);

    }
} 
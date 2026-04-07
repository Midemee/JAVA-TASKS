import java.util.Scanner;
public class Divisible{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a 3-digit number: ");
	int number = input.nextInt();

	if(number < 100 || number > 999) {
	System.out.println("Invalid, please enter a valid 3-digit integer");
	}
	else {
	int hundreds = number / 100;
	int tens = (number / 10) % 10;
	int units = number % 10;

	int sum = hundreds + tens + units;

	if (sum == 0) {
	System.out.printf("%d is divisible by the sum of its digits %d", number, sum);
	}
	else {
	System.out.printf("%d is Not divisible by the sum of its digits %d", number, sum);
	}

	}

    }
} 
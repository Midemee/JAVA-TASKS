import java.util.Scanner;
public class Multiple{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int numOne = input.nextInt();

	System.out.print("Enter the second number: ");
	int numTwo = input.nextInt();

	if (numOne % numTwo == 0) {
	System.out.printf("%d is a multiple of %d%n", numOne, numTwo);
	}
	else {
	System.out.printf("%d is not a multiple of %d%n", numOne, numTwo);
	}

    }
} 
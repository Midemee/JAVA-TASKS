import java.util.Scanner;
public class MultipleOperations{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int numOne = input.nextInt();

	System.out.print("Enter the second number: ");
	int numTwo = input.nextInt();

	if (numOne > numTwo) {
	System.out.printf("%d is the larger number %n", numOne);
	}
	else {
	System.out.printf("%d is the larger number %n", numTwo);
	}

	if (numOne < numTwo) {
	System.out.printf("%d is the smaller number%n", numOne);
	}
	else {
	System.out.printf("%d is the smaller number%n", numTwo);
	}

	int sum = numOne +  numTwo;
	System.out.printf("The sum is: %d%n", sum);
	int difference = numOne - numTwo;
	System.out.printf("The difference is: %d%n", difference);
	int product = numOne * numTwo;
	System.out.printf("The product is: %d%n", product);

	if (numTwo == 0) {
	System.out.println("Cannot divide by zero");
	}
	else {
	double quotient = (double)numOne / numTwo;
	System.out.printf("The quotient is: %.2f", quotient);
	}
    }
} 
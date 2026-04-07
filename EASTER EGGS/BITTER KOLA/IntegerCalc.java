import java.util.Scanner;
public class IntegerCalc{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int numOne = input.nextInt();

	System.out.print("Enter second number: ");
	int numTwo = input.nextInt();

	if (numOne > 0 && numTwo > 0) {
	int sum = numOne + numTwo;
	System.out.printf("Sum is %d%n", sum);
	}
	else if (numOne < 0 && numTwo < 0) {
	int product = numOne * numTwo;
	System.out.printf("Product is %d%n", product);
	}
	else {
	int difference = numOne - numTwo;
	System.out.printf("Difference is %d%n", difference);
	}
    }
} 
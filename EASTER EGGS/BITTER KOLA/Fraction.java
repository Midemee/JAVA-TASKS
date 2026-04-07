import java.util.Scanner;
public class Fraction{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first numerator: ");
	double numOne= input.nextDouble();

	System.out.print("Enter first denominator: ");
	double DenOne= input.nextDouble();

	System.out.print("Enter second numerator: ");
	double numTwo= input.nextDouble();

	System.out.print("Enter second denominator : ");
	double DenTwo= input.nextDouble();

	double resultOne = numOne/numTwo;
	double resultTwo = DenOne/DenTwo;

	double add = resultOne + resultTwo;
	double subtract = resultOne - resultTwo;
	double product = resultOne * resultTwo;

	System.out.printf("Sum: %.1f%nDifference: %.1f%nProduct: %.1f%n", add, subtract, product);

	if( resultOne == 0) {
	System.out.println("Quotient is not divisible by zero");
	}
	else {
	double quotient = resultOne / resultTwo;
	System.out.printf("Quotient: %.2f", quotient);
	}
    }
} 
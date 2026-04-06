import java.util.Scanner;
public class InterestCalculator{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter principal amount: ");
	double amount = input.nextDouble();

	System.out.print("Enter interest rate: ");
	double rate = input.nextDouble();

	System.out.print("Enter time in years: ");
	double time = input.nextDouble();

	double simpleInterest = amount* rate / time;
	double compoundInterest = simpleInterest - amount;

	System.out.printf("Simple Interest is %.2f%nCompound Interest is: %.2f", simpleInterest, compoundInterest);
    }
} 
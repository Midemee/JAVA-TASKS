import java.util.Scanner;
public class FutureValue{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the investment amount: ");
	double investmentAmt = input.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double annualInterestRate = input.nextDouble();

	System.out.print("Enter the number of years: ");
	int years = input.nextInt();

	double monthlyInterest = annualInterestRate / 1200;

	double futureInvestmentValue = investmentAmt * Math.pow(1 + monthlyInterest, years * 12);

	System.out.printf("Future investment value is: %.2f", futureInvestmentValue);
    }
}
import java.util.Scanner;
public class MonthlyInterest{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double interestRate = input.nextDouble();

	double interest = balance * (interestRate / 1200);

	System.out.printf("Next month interest is: %.2f", interest);
    }
}
import java.util.Scanner;
public class Savings{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the monthly saving amount: ");
	double monthlySavings = input.nextDouble();
	double monthlyInterestRate = 0.003125;
	
	double value =monthlySavings * 0.003125 * 6;

	System.out.printf("The value in 6 months is: %.2f", value );
    }
}
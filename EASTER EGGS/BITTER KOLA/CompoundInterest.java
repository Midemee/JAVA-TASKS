import java.util.Scanner;
public class CompoundInterest{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter initial bank balance: ");
	double balance = input.nextDouble();

	System.out.print("Enter annual interest rate: ");
	double rate = input.nextDouble();

	rate = rate / 100;
	double yearOne = balance * Math.pow(1 * rate, 1);
	double yearTwo = balance * Math.pow(1 * rate, 2);
	double yearThree = balance * Math.pow(1 * rate, 3);

	System.out.printf("Balance After: %nYear One: %.2f%nYear Two: %.2f%nYearThree: %.2f", yearOne, yearTwo, yearThree);

    }
} 
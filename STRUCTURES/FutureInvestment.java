import java.util.Scanner;

public class FutureInvestment {

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Years   Future Value");
        for (int index = 1; index <= 30; index++) {
            System.out.printf("%-8d%.2f%n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, index));
        }
    }
}

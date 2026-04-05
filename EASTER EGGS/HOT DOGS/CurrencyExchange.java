import java.util.Scanner;
public class CurrencyExchange{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter the exchange rate from USD to RMB: ");
	double exchangeRate = input.nextDouble();

	System.out.print("Enter 0 to convert USD to RMB or 1 for RMB to USD: ");
	int choice = input.nextInt();

	if (choice == 0) {
	System.out.print("Enter the amount in USD: ");
	double usd = input.nextDouble();
	double rmb = usd * exchangeRate;
	System.out.printf("%.2f USD is %.2f RMB", usd, rmb);
	} 
	else if (choice == 1) {
	System.out.print("Enter the amount in RMB: ");
	double rmb = input.nextDouble();
	double usd = rmb / exchangeRate;
	System.out.printf("%.2f RMB is %.2f USD", rmb, usd);
	} 
	else {
	System.out.println("Invalid input");
	}
    }
}
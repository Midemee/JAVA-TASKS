import java.util.Scanner;
public class HoursPerPay{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter your hourly wage: ");
	double wage = input.nextDouble();

	System.out.print("Enter your hours worked: ");
	double hours = input.nextDouble();

	double payment;

	if (hours <= 40) {
	payment = wage * hours;
	System.out.println(payment);
	}
	else {
	payment = wage * hours * 1.5;
	System.out.println(payment);
	}
    }
} 
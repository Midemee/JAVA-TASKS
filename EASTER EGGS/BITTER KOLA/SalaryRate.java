import java.util.Scanner;
public class SalaryRate{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter your salary: ");
	double salary= input.nextDouble();

	double rate;

	if (salary <= 50000) {
	rate = 0.0;
	}
	else if (salary <= 150000) {
	rate = 0.05;
	}
	else if (salary <= 500000) {
	rate = 0.075;
	}
	else {
	rate = 0.10;
	}
	double deduction = salary * rate;
	System.out.println("Deduction Rate: " + (rate * 100) + "%");
	System.out.println("Social Insurance Deduction: " + deduction);
    }
} 
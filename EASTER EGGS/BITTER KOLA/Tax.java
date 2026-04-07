import java.util.Scanner;
public class Tax{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter your monthly salary: ");
	double salary = input.nextDouble();

	double annualSalary = salary * 12;

	double tax;

	if (annualSalary <= 300000) {
	tax = 0;
	}
	else if (annualSalary <= 600000) {
	tax = (annualSalary - 300000) * 0.15;	
	}
	else {
	tax = (300000 * 0.15) + (annualSalary - 600000) *  0.25;
	}

	System.out.printf("Annual tax is: #%.2f", tax);
    }
} 
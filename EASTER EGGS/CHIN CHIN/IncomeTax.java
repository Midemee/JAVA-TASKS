import java.util.Scanner;
public class IncomeTax{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the filing status: ");
	String status = input.nextLine();

	System.out.print("Enter the taxable income: ");
	int income = input.nextInt();

	if (status == "single") {
	System.out.println("10% Tax rate");
	}
	else if (status == "married") {
	System.out.println("15% Tax rate");
	}
	else if (status == "Seperate") {
	System.out.println("25% Tax rate");
	}
	else if (status == "Household head") {
	System.out.println("28% Tax rate");
	}
	else {
	System.out.println("35% Tax rate");
	}
    }
}
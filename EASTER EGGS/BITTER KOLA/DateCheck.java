import java.util.Scanner;
public class DateCheck{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a day as an integer: ");
	int day = input.nextInt();

	System.out.print("Enter a month: ");
	int month = input.nextInt();

	System.out.print("Enter a year: ");
	int year = input.nextInt();

	if (day < 1 && day > 31) {
	System.out.println("Invalid");
	}
	else if (month < 1 && month > 12) {
	System.out.println("Invalid");
	}
	else if (year < 1 && year > 365) {
	System.out.println("Invalid");
	}
	else {
	System.out.println("Valid");
	}

    }
} 
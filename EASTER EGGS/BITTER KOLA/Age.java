import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter birth year: ");
	int birthYear = input.nextInt();

	System.out.print("Enter current year: ");
	int currentYear = input.nextInt();

	int age = currentYear - birthYear;

	if (age >= 65) {
	System.out.println("Eligible for discount");
	}
	else {
        System.out.println("Not eligible");
	}
    }
} 
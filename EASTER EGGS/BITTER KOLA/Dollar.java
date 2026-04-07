import java.util.Scanner;
public class Dollar{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a dollar amount within 1-10: ");
	int amount = input.nextInt();
	if (amount == 1) {
	System.out.println("One dollar");
	}
	else if (amount == 2) {
	System.out.println("Two dollars");
	}
	else if (amount == 3) {
	System.out.println("Three dollars");
	}
	else if (amount == 4) {
	System.out.println("Four dollars");
	}
	else if (amount == 5) {
	System.out.println("Five dollars");
	}
	else if (amount == 6) {
	System.out.println("Six dollars");
	}
	else if (amount == 7) {
	System.out.println("Seven dollars");
	}
	else if (amount == 8) {
	System.out.println("Eight dollars");
	}
	else if (amount == 9) {
	System.out.println("Nine dollars");
	}
	else {
	System.out.println("Ten dollars");
	}
    }
} 
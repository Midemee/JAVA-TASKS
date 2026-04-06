import java.util.Scanner;
public class AtmPIN{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	int code = 1234;

	System.out.print("Enter your PIN: ");
	int pin = input.nextInt();

	if (pin == code) {
	System.out.println("Successful, Your balance is: $1000");
	}
	else {
	System.out.println("Incorrect PIN");
	}
    }
} 
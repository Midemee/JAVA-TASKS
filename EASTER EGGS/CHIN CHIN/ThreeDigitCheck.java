import java.util.Scanner;
public class ThreeDigitCheck{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number >= 100 && number <= 999 || number <= -100 && number >= -999 ) {
	System.out.println("It is a three-digit number");
	}
	else {
	System.out.println("It is not a three-digit number ");
	}
    }
} 
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a positive 2-digit integer: ");
	int number= input.nextInt();
	int tens = number / 10;
	int units = number % 10;
	System.out.printf("%d,%d", units, tens);

    }
} 
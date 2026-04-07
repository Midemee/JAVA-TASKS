import java.util.Scanner;
public class Range{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if (number > 10 && number < 100) {
	System.out.println("This number is between 10 and 100");
	}
	else {
	System.out.println("This number is NOT between 10 and 100");
	}
    }
} 
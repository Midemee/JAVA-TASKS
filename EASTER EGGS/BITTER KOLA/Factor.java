import java.util.Scanner;
public class Factor{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a first integer: ");
	int numOne = input.nextInt();

	System.out.print("Enter a second integer: ");
	int numTwo = input.nextInt();

	if (numOne <= 0 || numTwo <= 0) {
	System.out.println("Enter positive numbers only");
	}
	else {
	    if (numTwo % numOne == 0) {
	    System.out.printf("%d is a factor of numTwo %d%n", numOne, numTwo);
	    }
	    else {
	    System.out.printf("%d is not a factor of numTwo %d%n", numOne, numTwo);
	    }

	}

    }
} 
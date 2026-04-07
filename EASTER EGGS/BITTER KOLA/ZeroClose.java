import java.util.Scanner;
public class ZeroClose{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int numOne = input.nextInt();

	System.out.print("Enter second number: ");
	int numTwo = input.nextInt();

	if (Math.abs(numOne) < Math.abs(numTwo)) {
	System.out.printf("%d is close to zero", numOne);
	}
	else if (Math.abs(numOne) > Math.abs(numTwo)) {
	System.out.printf("%d is close to zero", numTwo);
	}
	else {
	System.out.printf("Both numbers are close to zero");
	}
    }
} 
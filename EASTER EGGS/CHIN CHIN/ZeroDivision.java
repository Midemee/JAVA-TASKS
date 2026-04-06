import java.util.Scanner;
public class ZeroDivision{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer for m: ");
	int m = input.nextInt();

	System.out.print("Enter an integer for n: ");
	int n = input.nextInt();

	if (n != 0) {
	int result = m / n;
	System.out.printf("The result is: %d", result);	
	}
	else {
	System.out.println("Error, cannot be divided by zero");
	}
    }
}
import java.util.Scanner;
public class QuadraticEquation{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the value for a: ");
	double a = input.nextDouble();

	System.out.print("Enter the value for b: ");
	double b = input.nextDouble();

	System.out.print("Enter the value for c: ");
	double c = input.nextDouble();

	double discriminant = (b * b) - (4 * a * c);

	System.out.print(discriminant);
    }
}
import java.util.Scanner;
public class LinearEquation{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter number for a: ");
	double a = input.nextInt();

	System.out.print("Enter number for b: ");
	double b = input.nextInt();

	System.out.print("Enter number for c: ");
	double c = input.nextInt();

	if (a == 0) {
	System.out.println("The equation has no unique solution");
	}
	else {
	double x = (c - b) / a;
	System.out.printf("The solution is %.2f", x);
	}

    }
} 
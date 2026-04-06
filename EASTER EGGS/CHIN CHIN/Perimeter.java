import java.util.Scanner;
public class Perimeter{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the first edge of rectangle: ");
	double edgeOne = input.nextDouble();

	System.out.print("Enter the second edge of rectangle: ");
	double edgeTwo = input.nextDouble();

	if (edgeOne != edgeTwo) {
	double perimeter = 2 * (edgeOne + edgeTwo);
	System.out.println("The perimeter is: " + perimeter);
	}
	else {
	System.out.println("Invalid input, the edges must be different");
	}
    }
}
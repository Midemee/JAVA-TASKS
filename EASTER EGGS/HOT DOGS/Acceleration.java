import java.util.Scanner;
public class Acceleration{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter take off speed v in m/s: ");
	double takeOff = input.nextDouble();

	System.out.print("Enter acceleration a in m/s: ");
	double acceleration = input.nextDouble();

	double length = (takeOff * takeOff) / (2 * acceleration);
	System.out.printf("The minimum runaway length is: %.2f", length );
    }
}
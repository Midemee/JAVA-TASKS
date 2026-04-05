import java.util.Scanner;
public class Velocity{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter initial velocity u in meters/seconds: ");
	double velocityU= input.nextDouble();

	System.out.print("Enter time in seconds: ");
	double time= input.nextDouble();

	System.out.print("Enter acceleration (a) in meter/second square: ");
	double acceleration = input.nextDouble();

	double s = (velocityU * time) + (0.5 * acceleration * time * time);
	System.out.printf("The distance covered is: %.2fmeters", s);

    }
}
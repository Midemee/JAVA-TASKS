import java.util.Scanner;
public class Cylinder{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enterthe radius of cylinder: ");
	double radius = input.nextDouble();

	System.out.print("Enter the height of cylinder: ");
	double height = input.nextDouble();

	double surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
	double volume = Math.PI * Math.pow(radius, 2) * height;

	System.out.printf("The surface area is: %.2f%nThe volume is: %.2f", surfaceArea, volume);

	


    }
}
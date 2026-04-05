import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter x1: ");
	double x1 = input.nextDouble();

	System.out.print("Enter y1: ");
	double y1 = input.nextDouble();

	System.out.print("Enter x2: ");
	double x2 = input.nextDouble();

	System.out.print("Enter y2: ");
	double y2 = input.nextDouble();

	System.out.print("Enter x3: ");
	double x3 = input.nextDouble();

	System.out.print("Enter y3: ");
	double y3 = input.nextDouble();

	double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

	double side = (side1 + side2 + side3) /2;

	double area = Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
	System.out.printf("The area of the triangle is: %.2f", area);
	
    }
}
import java.util.Scanner;
public class SidesOfTriangle{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter one side of a triangle: ");
	int sideA = input.nextInt();

	System.out.print("Enter second side of a triangle: ");
	int sideB = input.nextInt();

	System.out.print("Enter third side ofa triangle: ");
	int sideC = input.nextInt();

	if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA ) {
	System.out.print("It's a valid triangle");
	}
	else if (sideA == sideB  && sideB == sideC ) {
	System.out.println("It is an equilatorial triangle");
	}
	else if (sideA == sideB && sideA == sideC || sideB == sideC) {
	System.out.println("It is an isosceles triangle");
	}
	else {
	System.out.println("It's a scalene triangle");
	}
    }
}
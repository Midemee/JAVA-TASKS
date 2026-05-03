import java.util.Scanner;

public class TriangleArea {

    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
               (side1 + side3 > side2) &&
               (side2 + side3 > side1);
    }

    public static double area(double side1, double side2, double side3) {
        double sides = (side1 + side2 + side3) / 2;
        return Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3))
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        else
            System.out.println("Invalid triangle");
    }
}

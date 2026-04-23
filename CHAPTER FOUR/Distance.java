import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = input.nextInt();

        System.out.print("Enter y1: ");
        int y1 = input.nextInt();

        System.out.print("Enter x2: ");
        int x2 = input.nextInt();

        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        if (x1 == x2) {
            System.out.println("The line is perpendicular to the X-axis (vertical line)");
        }
        else if (y1 == y2) {
            System.out.println("The line is perpendicular to the Y-axis (horizontal line)");
        }
        else {
            System.out.println("The line is NOT perpendicular to any axis");
        }
    }
}

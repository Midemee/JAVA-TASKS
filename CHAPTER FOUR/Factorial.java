import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inputEntry = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = inputEntry.nextInt();

        int factorial = 1;

        for (int count = 1; count <= number; count++) {
            factorial *= count;
        }

        System.out.println(number + "! = " + factorial);
    }
}

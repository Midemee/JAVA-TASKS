import java.util.Scanner;

public class DisplayPattern {

    public static void displayPattern(int number) {
        for (int row = 1; row <= number; row++) {
            for (int count = row; count >= 1; count--) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        displayPattern(number);
    }
}

import java.util.Scanner;

public class LoopTillSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        int sum = 0;

        while (sum < target) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            sum = sum + number;
            System.out.println("Current sum: " + sum);
        }

        System.out.println("You've reached target'");
        System.out.println("Final sum: " + sum);
    }
}

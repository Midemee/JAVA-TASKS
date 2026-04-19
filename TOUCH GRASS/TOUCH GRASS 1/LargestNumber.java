import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = 0;
        int count = 0;

        System.out.print("Enter an integer (0 to stop): ");
        int number = scanner.nextInt();

        while (number != 0) {

            if (number > largest) {
                largest = number;
                count = 1;
            } else if (number == largest) {
                count = count + 1;
            }

            System.out.print("Enter an integer (0 to stop): ");
            number = scanner.nextInt();
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("count times " + count);

    }
}

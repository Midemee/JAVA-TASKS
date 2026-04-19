import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a starting number: ");
        int userInput = input.nextInt();

        for (int number = userInput; number >= 1; number--) {
            System.out.println(number);
        }

        System.out.println("Blast off!");

        input.close();
    }
}

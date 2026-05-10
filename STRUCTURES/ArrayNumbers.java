import java.util.Scanner;

public class ArrayNumbers{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] occurrenceCount = new int[51];

        System.out.println("Enter integers between 1 and 50 (enter 0 to stop):");

        int currentNumber = input.nextInt();
        while (currentNumber != 0) {
            if (currentNumber >= 1 && currentNumber <= 50) {
                occurrenceCount[currentNumber]++;
            } else {
                System.out.println("Please enter a number between 1 and 50!");
            }
            currentNumber = input.nextInt();
        }

        System.out.println("\nResults:");

        int numberToCheck = 1;
        while (numberToCheck <= 50) {
            if (occurrenceCount[numberToCheck] >= 1) {

                if (occurrenceCount[numberToCheck] == 1) {
                    System.out.println(numberToCheck + " appears 1 time");
                } else {
                    System.out.println(numberToCheck + " appears " + occurrenceCount[numberToCheck] + " times");
                }

            }
            numberToCheck++;
        }

    }
}

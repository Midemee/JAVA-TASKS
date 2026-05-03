import java.util.Scanner;

public class SortedNumbers {

    public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree) {
        double order;

        if (numberOne < numberTwo) {
            order = numberOne;
            numberOne = numberTwo;
            numberTwo = order;
        }
        if (numberOne < numberThree) {
            order = numberOne;
            numberOne = numberThree;
            numberThree = order;
        }
        if (numberTwo < numberThree) {
            order = numberTwo;
            numberTwo = numberThree;
            numberThree = order;
        }

        System.out.printf("Numbers in decreasing order: %.1f %.1f %.1f%n", numberOne, numberTwo, numberThree);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();
        displaySortedNumbers(numberOne, numberTwo, numberThree);
    }
}

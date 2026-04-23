import java.util.Scanner;
public class BinaryNumber{
    public static void main(String[] args) {
        Scanner inputEntry = new Scanner(System.in);

        System.out.print("Enter a binary (0s and 1s only): ");
        int binary = inputEntry.nextInt();

        int decimal = 0;
        int positionalValue = 1;

        while(binary > 0) {
        int digit = binary % 10;
        decimal+= (digit * positionalValue);
        binary /= 10;

        }
        System.out.println("Decimal is: " + decimal);
    }

}

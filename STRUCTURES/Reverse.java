import java.util.Scanner;

public class ReverseDisplay {

    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10); 
            number /= 10;                 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Reversed Number: " + number );
        reverse(number);
    }
}

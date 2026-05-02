import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a three-digit number: ");
	int number = input.nextInt();
    if (number < 100 || number > 999){
        System.out.println("Invalid! Enter a three-digit number: ");
        return;
    }

    int units = number % 10;
    number /= 10;
    int tens = number % 10;
    number /= 10;
    int hundreds = number % 10;

    if(units == hundreds){
    System.out.println("It is a palindrome number");
    }
    else{
    System.out.println("It is not a palindrome number");
    }

    }
}

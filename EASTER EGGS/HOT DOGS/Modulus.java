import java.util.Scanner;
public class Modulus{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int checkOne = number % 2;
	int checkTwo = number % 3;
	int checkThree = number % 5;
	int checkFour = number % 7;

	System.out.println(checkOne);
	System.out.println(checkTwo);
	System.out.println(checkThree);
	System.out.println(checkFour);

    }
}
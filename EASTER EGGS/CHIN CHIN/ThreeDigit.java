import java.util.Scanner;
public class ThreeDigit{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a three-digit number: ");
	int number = input.nextInt();

	int stepOne = number / 100;
	int stepTwo = (number / 10) % 10;
	int stepThree = number % 10;

	int sum = stepOne + stepTwo + stepThree;
	System.out.println(sum);
    }
}
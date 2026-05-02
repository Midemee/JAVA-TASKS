import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a four-digit number: ");
	int number = input.nextInt();

	int stepOne = number % 10;
    number /= 10;
	int stepTwo = number % 10;
    number /= 10;
	int stepThree = number % 10;
    number /= 10;
	int stepFour = number % 10;

	System.out.printf("%d %d %d %d", stepOne, stepTwo, stepThree, stepFour);

    }
} 

import java.util.Scanner;
public class TaskThirty{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int numOne = userInput.nextInt();

	System.out.print("Enter another number: ");
	int numTwo = userInput.nextInt();

	int sum = numOne + numTwo;
	int product = numOne * numTwo;

	System.out.printf("The sum is %d%nThe product is %d", sum, product);
    }
}
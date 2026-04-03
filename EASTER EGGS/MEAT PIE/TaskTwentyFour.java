import java.util.Scanner;
public class TaskTwentyFour{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int numOne = userInput.nextInt();

	System.out.print("Enter the second number: ");
	int numTwo = userInput.nextInt();

	System.out.printf("The first number is %d%nThe second number is %d", numTwo, numOne);
	
    }
}
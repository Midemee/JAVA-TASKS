import java.util.Scanner;
public class TaskFourteen{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int numOne = userInput.nextInt();

	System.out.print("Enter second number: ");
	int numTwo = userInput.nextInt();

	System.out.print("Enter Third number: ");
	int numThree = userInput.nextInt();

	int average = (numOne + numTwo + numThree) / 3;

	System.out.println("The average is " + average);
	
    }
}
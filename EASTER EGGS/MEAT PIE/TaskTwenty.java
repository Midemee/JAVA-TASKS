import java.util.Scanner;
public class TaskTwenty{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter the length: ");
	int length = userInput.nextInt();

	System.out.print("Enter the width: ");
	int width = userInput.nextInt();

	int area = length * width;

	System.out.printf("The area is %d", area);
	
    }
}
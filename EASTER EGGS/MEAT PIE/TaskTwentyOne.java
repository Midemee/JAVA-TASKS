import java.util.Scanner;
public class TaskTwentyOne{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter the base: ");
	int base = userInput.nextInt();

	System.out.print("Enter the height: ");
	int height = userInput.nextInt();

	int area = (base * height) / 2;

	System.out.printf("The area of triangle is %d", area);
	
    }
}
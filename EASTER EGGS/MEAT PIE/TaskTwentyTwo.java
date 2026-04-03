import java.util.Scanner;
public class TaskTwentyTwo{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	double radius = userInput.nextInt();

	double area = 3.1479 * radius * radius;

	System.out.printf("The area of a circle is %.2f", area);
	
    }
}
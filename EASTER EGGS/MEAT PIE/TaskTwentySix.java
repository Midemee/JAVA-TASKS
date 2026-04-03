import java.util.Scanner;
public class TaskTwentySix{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name = userInput.nextLine();

	System.out.print("Enter your age: ");
	int age = userInput.nextInt();

	System.out.printf("I am %s and i am %dyears old", name, age);
    }
}
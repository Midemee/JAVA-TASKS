import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = userInput.nextInt();
	System.out.println("You are " + age + "years old");
    }
}
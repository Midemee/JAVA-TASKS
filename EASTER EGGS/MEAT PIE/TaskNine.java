import java.util.Scanner;
public class TaskNine{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
	System.out.print("What is your favorite color: ");
	String color = userInput.nextLine();
	System.out.println("Your favorite colour is " + color);
    }
}
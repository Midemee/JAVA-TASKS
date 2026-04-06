import java.util.Random;
import java.util.Scanner;
public class Lottery{
    public static void main(String[] args) {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
	int lottery = rand.nextInt(100);
	System.out.print("Enter two digits to pick lottery: ");
	int choice = scan.nextInt();

	if (choice == lottery) {
	System.out.println("It's a match, You win!");
	}
	else {
	System.out.println("Wrong match, You lose!");
	}
    }
}
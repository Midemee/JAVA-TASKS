import java.util.Random;
import java.util.Scanner;
public class GameSRP{
    public static void main(String[] args) {
    Random randGame = new Random();
    Scanner input = new Scanner(System.in);

	int game = randGame.nextInt(3);
	String result;

	System.out.print("Enter 0 for Scissors, 1 for Rock, 2 for paper: ");
	int choice = input.nextInt();
	
	if (game == 0) {
	result = "Scissors";
	}
	else if (game == 1) {
	result = "Paper";
	}
	else {
	result ="Rock";
	}

	if(game == 0 && choice == 0) {
	System.out.println("Scissors");
	}
	else if (game == 1 && choice == 1) {
	System.out.println("Paper");
	}
	else if (game == 2 && choice == 2) {
	System.out.println("Rock");
	}
	else {
	System.out.println("You lose!");
	}

    }
}
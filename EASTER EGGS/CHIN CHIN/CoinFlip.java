import java.util.Random;
import java.util.Scanner;
public class CoinFlip{
    public static void main(String[] args) {
    Random randCoin = new Random();
    Scanner input = new Scanner(System.in);

	int coin = randCoin.nextInt(2);
	String result;

	System.out.print("Guess a number (0-1): ");
	int guess = input.nextInt();
	
	if (coin == 0) {
	result = "Heads";
	}
	else {
	result ="Tails";
	}

	if(guess == 0 && coin == 0) {
	System.out.println("Correct, its Heads");
	}
	else if (guess == 1 && coin == 1) {
	System.out.println("its Tails");
	}
	else if (guess != 0 && guess != 1) {
	System.out.println("Invalid input!");
	}
	else {
	System.out.println("Wrong Choice");
	}

    }
}
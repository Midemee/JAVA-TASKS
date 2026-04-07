import java.util.Scanner;
public class Drink{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter number 1-5 for drinks: ");
	int drink= input.nextInt();

	if (drink == 1) {
	System.out.println("Water: #100");
	}
	else if (drink == 2) {
	System.out.println("Juice: #200");
	}
	else if (drink == 3) {
	System.out.println("Soda: #150");
	}
	else if (drink == 4) {
	System.out.println("Snack: #300");
	}
	else {
	System.out.println("Amount is insufficient");
	}
    }
} 
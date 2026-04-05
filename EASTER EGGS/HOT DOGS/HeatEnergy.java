import java.util.Scanner;
public class HeatEnergy{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter amount of water in kilograms: ");
	double waterAmount = input.nextDouble();

	System.out.print("Enter initial temperature: ");
	double initial= input.nextDouble();

	System.out.print("Enter final temperature: ");
	double final = input.nextDouble();

	double Q = waterAmount * () * 4.184;
	System.out.printf("The energy needed is: %.2f", Q);

    }
}
import java.util.Scanner;
public class Trip{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

 	System.out.print("Enter the distance to drive: ");
 	int miles = input.nextInt();

 	System.out.print("Enter the miles per gallon: ");
 	int mpg = input.nextInt();

 	System.out.print("Enter the price per gallon: ");
 	double gallonPrice = input.nextInt();

	double gallonUsed = (double)miles / mpg;
	double cost = gallonUsed * gallonPrice;

	System.out.printf("The cost of trip is %.2f", cost);

 }
}
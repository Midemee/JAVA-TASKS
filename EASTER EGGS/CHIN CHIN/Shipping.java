import java.util.Scanner;
public class Shipping{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter the weight of the package: ");
	double weight = input.nextDouble();
	double cost;

	if (weight > 0 && weight <= 2) {
	cost = 2.5;
	System.out.println("shipping cost is: " + "$" + cost);
	}
	else if (weight > 2 && weight <= 4) {
	cost = 4.5;
	System.out.println("shipping cost is: " + "$" + cost);
	}
	else if (weight > 4 && weight <= 10) {
	cost = 7.5;
	System.out.println("shipping cost is: " + "$" + cost);
	}
	else if (weight > 10 && weight <= 20) {
	cost = 10.5;
	System.out.println("shipping cost is: " + "$" + cost);
	}
	else if (weight > 20) {
	System.out.println("The package cannot be shipped: ");
	}
	else {
	System.out.println("Invalid wpackage weight");
	}
    }
}
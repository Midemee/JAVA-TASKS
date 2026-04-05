import java.util.Scanner;
public class UnitWeight{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the weight of package one: ");
	double boxOneWeight = input.nextDouble();
	System.out.print("Enter the price of package one: ");
	double boxOnePrice = input.nextDouble();

	System.out.print("Enter the weight of package two: ");
	double boxTwoWeight= input.nextDouble();
	System.out.print("Enter the price of package two: ");
	double boxTwoPrice = input.nextDouble();

	double unitPriceOne = boxOnePrice / boxOneWeight;
	double unitPriceTwo = boxTwoPrice / boxTwoWeight;

	if (unitPriceOne > unitPriceTwo) {
	System.out.println("Package one has a better price");
	}
	else if (unitPriceTwo > unitPriceOne) {
	System.out.print("Package two has a better price");
	}
	else {
	System.out.println("both packages has the same price");
	}
    }
}
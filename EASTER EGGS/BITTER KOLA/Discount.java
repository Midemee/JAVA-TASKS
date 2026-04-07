import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter the price: ");
	double price = input.nextDouble();

	System.out.print("Enter the discount percentage: ");
	double discount = input.nextDouble();

	double discountAmount = (discount / 100) * price;

	double finalPrice = price - discountAmount;

	System.out.printf("Final price: %.2f%nDiscount Price: %.2f", finalPrice, discountAmount);
    }
} 
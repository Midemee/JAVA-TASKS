/*4.19 Sales Commission Calculator
PSEUDOCODE
TOP LEVEL
Input one salesperson's items sold last week
Calculate and display the salesperson's earnings

STEP-WISE REFINEMENT
Initialize itemCount to 1
Intialize the itemsSold to 0
initialize monthly fee $200

While items sold is less than or equal to 4
Prompt user to enter the price of item
input price in a variable
Add the price to the total itemsSold
Declare variable commission is equal to
Calculate the the totalitemsold * 0.09 + $200
print the result*/

import java.util.Scanner;
public class SalesCommission{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	int fee = 200;
	double itemsSold = 0;

	System.out.print("Enter the price of item sold (or -1 to quit): ");
	double items = input.nextDouble();

	while (items != -1) {
	itemsSold += items;
        System.out.print("Enter the price of item sold (or -1 to quit): ");
	items = input.nextDouble();
	}
        double earnings = itemsSold * 0.09 + fee;
	System.out.printf("%s%.2f%n", "The salesperson's earning is: ", earnings);
	

	}
}


/*4.20 TAX CALCULATOR
PSEUDOCODE
TOP LEVEL
Write a program that determines the total tax for each of three citizens

STEP-WISE REFINEMENT
create a loop tthat runs three times
collects citizen name
collect citizen earnings per year
If earnings is equal to 30,000 
Calculate the tax rate for earnings
print out the name 
Print out the tax 
Else if earnings is greater than 30,000 
Calculate the tax rate for earnings
Print out the tax
Else, the citizen's earning remain unchanged 
Print out, the earnings and message "No tax applied"*/ 


import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    for (int count = 1; count <= 3; count++){
        System.out.print("Enter citizen name" + count + ": ");
        String name = input.nextLine();
        System.out.print("Enter yearly earnings for " + name + ": ");
        double earnings = input.nextDouble();   
        input.nextLine();

	double tax = 0;
	if (earnings <= 30000) {
	tax = earnings * 0.15;
	System.out.printf("%n%s: The total earnings with tax applied is %.2f%n", name, tax);
	} 
	else {
	tax = earnings * 0.15;
    double remainderTax = (earnings - 30000) * 0.20;
    double newTax = tax + remainderTax;
	System.out.printf("%s: The total earnings with tax applied is %.2f%n", name, newTax);
	}

    }

	}
}

//CreditLimit application Exercise 4.18
/*import java.util.Scanner;
public class CreditLimit{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter Customer's Account number or -1 to quit");
    int acctNum = input.nextInt();
	if (acctNum == -1) {
	System.out.print("No account number recorded!");
	}
	else {

	while (acctNum != -1) {
	System.out.print("Enter the beginning balance: ");
        int startBalance = input.nextInt();

	System.out.print("Enter the total charges or purchases: ");
        int charges = input.nextInt();

	System.out.print("Enter the credit made: ");
	int credit = input.nextInt();

	System.out.print("Enter the credit limit: ");
        int creditLimit = input.nextInt();

	int newBalance = startBalance + charges - credit;
	System.out.printf("The new balance is %d%n", newBalance);

	if (newBalance > creditLimit) {
	System.out.println("You have exceeded your credit limit");
        }
	else {
	System.out.printf("Your remaining credit is %d%n", creditLimit - newBalance);
	}
	System.out.println();

	System.out.println("Enter Customer's Account number or -1 to quit");
        acctNum = input.nextInt();

	}
	}

}
}*/


//Using the counter-controlled loop
import java.util.Scanner;
public class CreditLimit{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);f

System.out.print("Enter the number of customers: ");

/* if (!input.hasNextInt()) {
   System.out.println("Invalid input, please enter the number of customers: ");
}*/

int numOfCustomers = input.nextInt();

if (numOfCustomers <= 0) {
System.out.println("No Accounts recorded!");
}
else {

	int customer = 1;

	while(customer <= numOfCustomers) {

  	System.out.print("Enter Customer's Account number: ");
    	int acctNum = input.nextInt();

	System.out.print("Enter the beginning balance: ");
        int startBalance = input.nextInt();

	System.out.print("Enter the total charges or purchases: ");
        int charges = input.nextInt();

	System.out.print("Enter the credit made: ");
	int credit = input.nextInt();

	System.out.print("Enter the credit limit: ");
        int creditLimit = input.nextInt();

	int newBalance = startBalance + charges - credit;
	System.out.printf("The new balance is %d%n", newBalance);

	if (newBalance > creditLimit) {
	System.out.println("You have exceeded your credit limit");
        }
	else {
	System.out.printf("Your remaining credit is %d%n", creditLimit - newBalance);
	}
	System.out.println();
	customer++;

	}	
}
	
	
}
}
import java.util.Scanner;
public class TensAndUnits{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a two-digit number: ");
	int number = input.nextInt();

	int tens = number / 10;
	int units = number % 10;

	if (tens > units) {
	System.out.println("The tens digit is greater than the units digit");
	} 
	else if (tens < units) {
	System.out.println("The tens digit is lesser than the units digit");
	} 
	else{
	System.out.println("The tens digit is equal to the units digit");
	} 
    }
} 
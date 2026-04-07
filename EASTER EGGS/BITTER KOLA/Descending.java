import java.util.Scanner;
public class Descending{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int numOne = input.nextInt();

	System.out.print("Enter second integer: ");
	int numTwo = input.nextInt();
	
	System.out.print("Enter the third integer: ");
	int numThree = input.nextInt();

	int highest = 0;

	if(numOne > numTwo && numOne > numThree) {
	highest = numOne;
	}
	else if(numTwo > numOne && numTwo > numThree) {
	highest = numTwo;
	}
	if(numThree > numTwo && numThree > numTwo) {
	highest = numThree;
	}

	System.out.print(highest);

    }
} 
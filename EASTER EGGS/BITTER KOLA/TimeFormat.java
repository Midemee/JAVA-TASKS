import java.util.Scanner;
public class TimeFormat{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter first time (hours): ");
	int hourOne = input.nextInt();

	System.out.print("Enter first time (mins): ");
	int minsOne = input.nextInt();

	System.out.print("Enter second time (hours): ");
	int hourTwo = input.nextInt();

	System.out.print("Enter second time (mins): ");
	int minsTwo = input.nextInt();

	int totalMins = minsOne + minsTwo;
	int totalHours = hourOne + hourTwo;
	
	System.out.printf("Total Time is: %02d:%02d%n", totalHours, totalMins);

    }
} 
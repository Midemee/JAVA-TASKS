import java.util.Scanner;
public class TimeConvert{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter number of minutes: ");
	int minutes = input.nextInt();

	int days = minutes / (60 * 24);
	int remainingMins = minutes % (60 * 24);
	int hours = remainingMins / 60;
	int min = remainingMins % 60;

	System.out.printf("Days: %d Hours: %d Mins: %d", days, hours, min);
	
    }
} 
import java.util.Scanner;
public class DayCheck{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter number of days from today: ");
	int days = input.nextInt();

	int future = days % 7;

	if (future == 0) {
	System.out.println("Monday");
	}
	else if (future == 1) {
	System.out.println("Tuesday");
	}
	else if (future == 2) {
	System.out.println("Wednesday");
	}
	else if (future == 3) {
	System.out.println("Thursday");
	}
	else if (future == 4) {
	System.out.println("Friday");
	}
	else if (future == 5) {
	System.out.println("Saturday");
	}
	else if (future == 6) {
	System.out.println("Sunday");
	}
	else{
	System.out.println("Invalid");
	}
    }
} 
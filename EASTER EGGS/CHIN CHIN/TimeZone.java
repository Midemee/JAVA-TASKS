import java.util.Scanner;
public class TimeZone{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter current hour within 0-23: ");
	int hour = input.nextInt();

	if (hour >= 7) {
	System.out.println("Good Morning");
	}
	else if (hour >= 12) {
	System.out.println("Good Afternoon");
	}
	else if (hour >= 4) {
	System.out.println("Good Evening");
	}
	else if (hour >= 10) {
	System.out.println("Good Night");
	}
	else {
	System.out.println("Invalid hour");
	}

    }
} 
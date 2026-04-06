import java.util.Scanner;
public class DaysInMonth{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the month: ");
	int month = input.nextInt();

	System.out.print("Enter the year: ");
	int year = input.nextInt();

	int daysInMonth = year / month;
	System.out.println(daysInMonth);
    }
}
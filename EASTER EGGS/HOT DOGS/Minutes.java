import java.util.Scanner;
public class Minutes{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a number of minutes: ");
	int mins = input.nextInt();
	int totalDays = mins / (60 * 24);
	int years = totalDays / 365;
	int remainingDays = totalDays % 365;

	System.out.printf("%d = %dyears and %ddays", mins, years, remainingDays);

 }
}
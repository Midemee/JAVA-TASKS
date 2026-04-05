import java.util.Scanner;
public class MeterToPing{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a square meter: ");
	int squareMeters = input.nextInt();
	double ping = (double)squareMeters * 0.3025;
	
	System.out.printf("%dsquareMeters = %.2fping", squareMeters, ping);
    }
}
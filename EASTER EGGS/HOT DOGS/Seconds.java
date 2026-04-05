import java.util.Scanner;
public class Seconds{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a number of seconds: ");
	int secs = input.nextInt();

	int hours = secs / 3600;
	int mins = (secs % 3600) / 60;
	int remainingSecs = secs % 60;

	System.out.printf("%dhours: %dmins: %dsecs: ", hours, mins, remainingSecs);

 }
}
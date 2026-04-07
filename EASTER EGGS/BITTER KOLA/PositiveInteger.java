import java.util.Scanner;
public class PositiveInteger{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int number= input.nextInt();

	int result = (number * (number * 1)) / 2;
	System.out.println(result);

	/**Let me know your observation*/
    }
} 
import java.util.Scanner;
public class NoLoop{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a positive number: ");
	int number = input.nextInt();

	int sum = number * (number + 1) / 2;

	System.out.printf("The result is %d", sum);

    }
} 
import java.util.Scanner;
public class UserSum{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int sum = 0;
	int count = 1;
	while (count <= number) {
	sum = sum + count;
	System.out.println(sum);
	count++;
	}
    }
}
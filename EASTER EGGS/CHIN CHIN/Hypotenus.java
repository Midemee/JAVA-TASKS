import java.util.Scanner;
public class Hypotenus{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the first length: ");
	double lengthOne = input.nextDouble();

	System.out.print("Enter the second length: ");
	double lengthTwo = input.nextDouble();

	double hypotenuse = Math.sqrt((lengthOne * lengthOne) + (lengthTwo * lengthTwo));

	System.out.printf("The hypotenus is: %.2f", hypotenuse);
    }
} 
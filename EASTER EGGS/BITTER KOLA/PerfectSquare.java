import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter positive integer: ");
	int number= input.nextInt();

	if (number < 0) {
	System.out.println("Please Enter positive integer");
	}
	else {
	int squareRoot = (int) Math.sqrt(number);
	if (squareRoot * squareRoot == number ) {
	System.out.println("It is a perfect square");
	}
	else {
	System.out.print("It is not a perfect square");
	}
	}

    }
} 
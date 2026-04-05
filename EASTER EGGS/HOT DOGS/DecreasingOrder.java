import java.util.Scanner;
public class DecreasingOrder{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the value for a: ");
	double a = input.nextDouble();

	System.out.print("Enter the value for b: ");
	double b = input.nextDouble();

	System.out.print("Enter the value for c: ");
	double c = input.nextDouble();

	if (a <= b && a>= c) {
	System.out.println("A is the smallest number");
	}
	else if (b <= a && b <= c){
	System.out.println("B is the smallest number");
	}
	else {
	System.out.println("C is the smallest number");
	}


	if (a >= b && a>= c) {
	System.out.println("A is the largest number");
	}
	else if (b >= a && b >= c){
	System.out.println("B is the largest number");
	}
	else {
	System.out.println("C is the largest number");
	}
	
    }
}
import java.util.Scanner;
public class IntegerSum{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter a number witin 0-1000: ");
	int number = input.nextInt();
	int sum = 0;

	if(number < 0 || number > 1000) {
    	System.out.println("Invalid number! Enter number within 0-1000");
	}
	else{

	while(number > 0) {
	  int remainder = number % 10;
	  sum = sum + remainder;
	  number = number / 10;
	}
	System.out.printf("The sum is %d", sum);
	}

 }
}
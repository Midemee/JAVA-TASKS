import java.util.Scanner;
public class Score{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

 	System.out.print("Enter the score from 0-100: ");
 	int score = input.nextInt();

	if (score <= 100 && score >= 90) {
	System.out.print("A");
	} 
	else if (score >= 80 ) {
	System.out.print("B");
	}
	else if (score >= 70 ) {
	System.out.print("C");
	}
	else if (score >= 60) {
	System.out.print("D");
	}
	else {
	System.out.print("F");
	}
    }
}
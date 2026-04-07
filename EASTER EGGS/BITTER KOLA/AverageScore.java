import java.util.Scanner;
public class AverageScore{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter exam score One: ");
	double score1= input.nextDouble();

	System.out.print("Enter exam score Two: ");
	double score2= input.nextDouble();

	System.out.print("Enter exam score Three: ");
	double score3= input.nextDouble();

	double average = (score1 + score2 + score3) / 3;

	// double grade = average * 0.40;

	if (average >= 0.36 && average <= 0.40) {
	System.out.println("Highest");
	}
	else if (average >= 0.26 && average <= 0.35) {
	System.out.println("Middle");
	}
	else if (average >= 0.26 && average <= 0.35) {
	System.out.println("Lowest");
	}
	else {
	System.out.println("Invalid");
	} 

    }
} 
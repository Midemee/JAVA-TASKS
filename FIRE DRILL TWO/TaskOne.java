import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    int gradeCount = 1;
    int sum = 0;
	while (gradeCount <= 10) {

	System.out.print("Enter a score: ");
    int score = userInput.nextInt();

	sum = sum + score;

    gradeCount++;
	}

	System.out.println("Sum = " + sum);
}
}

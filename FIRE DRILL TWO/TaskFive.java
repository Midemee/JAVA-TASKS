import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    int gradeCount = 1;
    int sum = 0;
	while (gradeCount <= 10) {

	System.out.print("Enter a score: ");
    int score = userInput.nextInt();
    if (score % 2 == 0) {
    sum = sum + score;
    }
    gradeCount++;
	}

	System.out.println("Sum of even numbers = " + sum);
}
}
//collect 10 scores and print sum of only the even numbers in the collected score

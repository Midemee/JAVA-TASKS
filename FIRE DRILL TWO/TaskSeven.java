import java.util.Scanner;
public class TaskSeven{
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
    double average = (double)sum / gradeCount;
    System.out.println("Sum of even numbers = " + sum);
    System.out.printf("Average = %.2f ", average);
}
}

//print sum and average of task 5

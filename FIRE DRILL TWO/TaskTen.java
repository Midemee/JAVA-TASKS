import java.util.Scanner;
public class TaskNine{
    public static void main(String[] args){
    Scanner inputCollect = new Scanner(System.in);

    int scoreCount = 1;
    int sum = 0;
    while (scoreCount <= 10) {
    System.out.print("Enter valid numbers (1-100): ");
    int score = inputCollect.nextInt();

    if (score % 4 == 0) {
    sum += score;
    }
    scoreCount++;
    }
    double average = (double)sum / scoreCount;
    System.out.printf("Average = %.2f ", average);
    }
}
//print average from task 9

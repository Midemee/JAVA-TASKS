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
	System.out.println("Sum of valid scores = " + sum);
    }
}

//collect 10 scores and sum only valid

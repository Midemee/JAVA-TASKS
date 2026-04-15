import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    int count = 1;
    int sum = 0;
	while (count <= 10) {

	System.out.print("Enter a score: ");
    int score = userInput.nextInt();

	sum = sum + score;
    int total = sum;
    int average = total/count;
    count++;
    System.out.print(average);
	}
	
}
}

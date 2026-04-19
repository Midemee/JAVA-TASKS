import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);

    int gradeCount = 1;
    int even = 0;
	while (gradeCount <= 10) {

	System.out.print("Enter a score: ");
    int score = userInput.nextInt();

	if(gradeCount % 2 == 0) {
    even = even + score;                                      
    }
    gradeCount++;  
	}
	System.out.println("Sum of even = " + even);

/*int even = 0;
for (int count = 1; count <=10; count++){
    
	System.out.print("Enter a score: ");
    int score = userInput.nextInt();

	if(count % 2 == 0) {
    even = even + score;                                     
    }
}
	System.out.println("Sum of even = " + even);*/
  
}
}

/*collect 10 scores and print sum of the ecen indexes(2nd number, 4th number, 10th number)
collect 10 scores and print sum of only the even numbers in the collected score*/

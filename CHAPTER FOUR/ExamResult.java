//Re-factored code, checks for invalid input by user
import java.util.Scanner;
public class ExamResult{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int passes = 0;
int failures = 0;
int studentCounter = 1;

while (studentCounter <= 10) {
System.out.print("Enter the exam result (1 = pass, 2 = fail): ");
int examResult = input.nextInt();
  while (examResult !=1 && examResult !=2) {
   System.out.print("Not a valid exam result! Enter the exam result (1 = pass, 2 = fail): ");
   examResult = input.nextInt();
  }

  if (examResult == 1) {
  passes += 1;
  }
  else {
  failures += 1;
  } 

studentCounter += 1;
}

System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

if (passes > 8) {
System.out.println("Bonus to the instructor!");
}
}
}


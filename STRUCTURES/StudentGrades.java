import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int[] scores = new int[numberOfStudents];

        int best = 0;

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();

            if (scores[i] > best) {
                best = scores[i];
            }
        }

        System.out.println("\nBest score is: " + best);
        System.out.println();

        for (int i = 0; i < numberOfStudents; i++) {

            char grade;

            if (scores[i] >= best - 5) {
                grade = 'A';
            } 
            else if (scores[i] >= best - 10) {
                grade = 'B';
            } 
            else if (scores[i] >= best - 15) {
                grade = 'C';
            } 
            else if (scores[i] >= best - 20) {
                grade = 'D';
            } 
            else {
                grade = 'F';
            }

            System.out.println(
                "Student " + i +
                " score is " + scores[i] +
                " and grade is " + grade
            );
        }


    }
}

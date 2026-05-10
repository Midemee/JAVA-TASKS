import java.util.Random;
import java.util.Scanner;

public class Arithmetic {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static int[] generateQuestion() {
        int firstNumber = random.nextInt(20) + 1;
        int secondNumber = random.nextInt(20) + 1;

        if (secondNumber > firstNumber) {
            int temporaryNumber = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temporaryNumber;
        }

        return new int[]{firstNumber, secondNumber};
    }

    public static boolean checkAnswer(int firstNumber, int secondNumber, int userAnswer) {
        int correctAnswer = firstNumber - secondNumber;

        if (userAnswer == correctAnswer) {
            return true;
        }

        return false;
    }

    public static double calculateScore(int correctAnswers, int totalQuestions) {
        double score = ((double) correctAnswers / totalQuestions) * 100;
        return score;
    }

    public static boolean askQuestion(int firstNumber, int secondNumber) {
        int attempts = 2;

        while (attempts > 0) {
            System.out.print("What is " + firstNumber + " - " + secondNumber + "? ");
            int answer = scanner.nextInt();

            if (checkAnswer(firstNumber, secondNumber, answer)) {
                System.out.println("Correct!");
                return true;
            } else {
                attempts--;
                System.out.println("Wrong answer.");

                if (attempts > 0) {
                    System.out.println("Try again.");
                }
            }
        }

        System.out.println("No attempts left!");
        return false;
    }
}

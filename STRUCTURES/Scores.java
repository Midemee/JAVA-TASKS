import java.util.Scanner;

public class ScoreAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] scores = new double[100];

        int count = 0;
        double sum = 0;

        System.out.println("Enter scores (negative number to stop):");

        while (count < 100) {

            double score = input.nextDouble();

            if (score < 0) {
                break;
            }

            scores[count] = score;
            sum += score;
            count++;
        }

        double average = sum / count;

        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {

            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Scores above or equal to average: " + aboveOrEqual);
        System.out.println("Scores below average: " + below);

    }
}

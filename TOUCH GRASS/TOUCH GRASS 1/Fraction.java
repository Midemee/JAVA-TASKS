public class Fraction{
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i <= 99; i += 2) {
            double numerator = i;
            double denominator = i + 2;
            sum = sum + (numerator / denominator);
        }

        System.out.printf("The sum is: %.2f", sum);
    }
}

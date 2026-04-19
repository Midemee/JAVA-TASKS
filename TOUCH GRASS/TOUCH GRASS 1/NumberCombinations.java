public class NumberCombinations {
    public static void main(String[] args) {

        int count = 0;

        for (int times = 1; times <= 7; times++) {
                System.out.println(times);
                count++;
        }

        System.out.printf("Total combinations: %n%d", count);
    }
}

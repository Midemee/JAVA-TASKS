public class Pentagon{

    public static int getPentagonalNumber(int number) {
        int result = number * (3 * number - 1) / 2;

        return result;
    }

    public static void main(String[] args) {
        for (int index = 1; index <= 100; index++) {
            System.out.printf("%7d", getPentagonalNumber(index));
            if (index % 10 == 0) {
                System.out.println();
            }
        }
    }
}

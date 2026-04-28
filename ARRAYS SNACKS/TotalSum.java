public class TotalSum {

    public static void runningTotal(int[] array) {
        int total = 0;

        for (int count = 0; count < array.length; count++) {
            total += array[count];
            System.out.print(total + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.print("Running total: ");
        runningTotal(numbers);
    }
}

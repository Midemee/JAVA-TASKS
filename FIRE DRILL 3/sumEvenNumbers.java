public class sumEvenNumbers{

    public static void evenPositions(int[] array) {
        int sum = 0;
        for (int count = 0; count < array.length; count += 2) {
            sum = sum + array[count];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.print("Sum: ");
        evenPositions(numbers);
    }
}

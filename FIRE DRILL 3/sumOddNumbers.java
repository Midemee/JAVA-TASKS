public class sumOddNumbers{

    public static void oddPositions(int[] array) {
        int sum = 0;
        for (int count = 1; count < array.length; count += 2) {
            sum = sum + array[count];
        }
         System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.print("Sum: ");
        oddPositions(numbers);
    }
}

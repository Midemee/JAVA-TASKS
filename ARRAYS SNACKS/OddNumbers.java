public class OddNumbers {

    public static void oddPositions(int[] array) {
        for (int count = 1; count < array.length; count += 2) {
            System.out.print(array[count] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.print("Elements at odd positions: ");
        oddPositions(numbers);
    }
}

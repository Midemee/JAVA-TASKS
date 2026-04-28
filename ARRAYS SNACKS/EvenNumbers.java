public class EvenNumbers {

    public static void evenPositions(int[] array) {
        for (int count = 0; count < array.length; count += 2) {
            System.out.print(array[count] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.print("Elements at even positions: ");
        evenPositions(numbers);
    }
}

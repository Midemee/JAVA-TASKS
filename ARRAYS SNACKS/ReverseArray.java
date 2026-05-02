public class ReverseArray {

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];

        for (int count = 0; count < array.length; count++) {
            reversed[array.length - 1 - count] = array[count];
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = reverseArray(numbers);

        System.out.print("Reversed array: ");
        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}

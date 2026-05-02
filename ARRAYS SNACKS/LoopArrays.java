public class LoopArrays {

    public static int sumForLoop(int[] array) {
        int sum = 0;
        for (int count = 0; count < array.length; count++) {
            sum += array[count];
        }
        return sum;
    }

    public static int sumWhileLoop(int[] array) {
        int sum = 0;
        int count = 0;
        while (count < array.length) {
            sum += array[count];
            count++;
        }
        return sum;
    }

    public static int sumDoWhile(int[] array) {
        int sum = 0;
        int count = 0;
        do {
            sum += array[count];
            count++;
        } while (count < array.length);
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.println("Sum using for loop: "      + sumForLoop(numbers));
        System.out.println("Sum using while loop: "    + sumWhileLoop(numbers));
        System.out.println("Sum using do-while loop: " + sumDoWhile(numbers));
    }
}

public class CheckArray {

    public static boolean elementExists(int[] array, int target) {
        for (int count = 0; count < array.length; count++) {
            if (array[count] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 15, 9, 2};

        System.out.println(elementExists(numbers, 15));
        System.out.println(elementExists(numbers, 8)); 
    }
}

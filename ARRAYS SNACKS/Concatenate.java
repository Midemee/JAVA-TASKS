public class Concatenate {

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int count = 0; count < array1.length; count++) {
            result[count] = array1[count];
        }

        for (int count = 0; count < array2.length; count++) {
            result[array1.length + count] = array2[count];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] result = concatenateArrays(array1, array2);

        System.out.print("Concatenated array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

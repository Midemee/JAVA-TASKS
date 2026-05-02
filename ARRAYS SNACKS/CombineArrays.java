public class CombineArrays {

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            result[k++] = array1[i++];
            result[k++] = array2[j++];
        }

        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] result = interleaveArrays(array1, array2);

        System.out.print("Interleaved array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

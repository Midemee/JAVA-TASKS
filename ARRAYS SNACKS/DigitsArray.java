public class DigitsArray {

    public static int[] digitArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];

        for (int count = 0; count < numStr.length(); count++) {
            digits[count] = Character.getNumericValue(numStr.charAt(count));
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] result = digitArray(2342);

        System.out.print("Digits: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}

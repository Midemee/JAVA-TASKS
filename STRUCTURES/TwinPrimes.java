public class TwinPrimes {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int divisor = 2;
        while (divisor < number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Twin primes less than 1200:");

        int currentNumber = 2;
        int totalPairsFound = 0;

        while (currentNumber < 1198) {
            boolean firstNumberIsPrime = isPrime(currentNumber);
            boolean secondNumberIsPrime = isPrime(currentNumber + 2);

            if (firstNumberIsPrime && secondNumberIsPrime) {
                System.out.println("(" + currentNumber + ", " + (currentNumber + 2) + ")");
                totalPairsFound++;
            }
            currentNumber++;
        }

        System.out.println("Total twin prime pairs found: " + totalPairsFound);
    }
}

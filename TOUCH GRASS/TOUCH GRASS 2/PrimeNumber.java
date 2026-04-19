public class PrimeNumber{
    public static boolean isPrimeNumber(int number){
        if (number <= 1){
            return false;
        }
        else{
            if(number % 2 == 0 ) {
                return false;
            }
        return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(10));
        System.out.println(isPrimeNumber(7));
    }

}

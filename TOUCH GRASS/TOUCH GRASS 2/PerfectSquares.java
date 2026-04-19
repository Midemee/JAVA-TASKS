public class PerfectSquares{
    public static boolean isPerfectSquare(int number){
        if (number < 0) {
            return false;
        }
        else {
            int SquareRoot = (int)Math.sqrt(number);
                return SquareRoot * SquareRoot == number;
        }

    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(27));
    }

}

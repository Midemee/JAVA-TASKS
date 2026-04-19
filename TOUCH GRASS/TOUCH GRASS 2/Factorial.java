public class Factorial{
    public static long factorial(int number){
        if(number < 0){
            return -1;
        }
        long result = 1;

        for (int count = 1; count <= number; count++){
            result *= count;
        }
        return result;

    }

    public static void main(String[]args){
    System.out.println(factorial(5));
    System.out.println(factorial(8));
    }

}

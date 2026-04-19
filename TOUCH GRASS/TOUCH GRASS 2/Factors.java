public class Factors{
    public static int NumberFactor(int number){
        int sum = 0;
        for (int count = 1; count <= number; count++){
            sum += count;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(NumberFactor(10));
        System.out.println(NumberFactor(5));
    }

}

public class NumberTable{
    public static void main(String[] args){
        System.out.println("N\tN^2\tN^3\tN^4");
        for(int number = 1; number <= 5; number++){
            int square = number*number;
            int cube = number*number*number;
            int fourthPower = number*number*number*number;

        System.out.printf("%d\t%d\t%d\t%d\n", number, square, cube, fourthPower);
        }
    }

}


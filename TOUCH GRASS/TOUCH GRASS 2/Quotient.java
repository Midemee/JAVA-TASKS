public class Quotient{
    public static float divide(int numberOne, int numberTwo){
        if(numberTwo == 0){
            return 0;
        }
        else{
            return (float)numberOne / numberTwo;
        }

    }

    public static void main(String[] args){
        System.out.println(divide(15,0));
        System.out.println(divide(15,4));
    }

}

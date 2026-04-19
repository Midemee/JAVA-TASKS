public class Maximum{
    
    public static int max(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        }
        else {
            return numberTwo;
        }
    }

    public static void main(String[] args) {
        int result = max(20, 8);
        System.out.println("The maximum number is: " + result);
    }
}

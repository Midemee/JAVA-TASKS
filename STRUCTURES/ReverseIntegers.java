import java.util.Scanner;

public class ReverseIntegers{
    public static void reverseNumbers(){
    Scanner inputCollector = new Scanner(System.in);
        int[] allNumbers = new int[10];
        int reverse = 0;
        for(int index = 0; index < 10; index++){
            System.out.print("Enter an integer: ");
            allNumbers[index] = inputCollector.nextInt();
        }

        for(int reverseIndex = 9; reverseIndex >= 0; reverseIndex--){
        System.out.print(allNumbers[reverseIndex] + ",");
        }
    }

    public static void main(String[] args){
    reverseNumbers();

    }
}


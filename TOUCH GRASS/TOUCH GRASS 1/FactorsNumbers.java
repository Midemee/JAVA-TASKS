import java.util.Scanner;
public class FactorsNumbers {
    public static void main(String[] args) {
    
        Scanner inputCollect = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int number = inputCollect.nextInt();
        
        for (int counter = 1; counter <= number; counter++) { 
        
            if (number % counter == 0) {
                System.out.println(counter + " ");
            }
        }
    }
}

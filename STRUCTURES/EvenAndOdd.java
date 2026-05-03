import java.util.Scanner;
public class EvenAndOdd{
    public static void numbers(){
    Scanner inputCollector = new Scanner(System.in);
    
    int evenNumbers = 0;
    int oddNumbers = 0;
    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt();
    while (number != 0) {
        if (number % 2 == 0){
            evenNumbers += 1;
        }
        else{
            oddNumbers += 1;
        }
        System.out.print("Enter a number: ");
        number = inputCollector.nextInt();
    }
        System.out.println("Even Number Count: " + evenNumbers);
        System.out.println("Odd Numbers Count: " + oddNumbers);
    }

    public static void main(String[] args){
        numbers();
    }
}

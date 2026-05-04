import java.util.Scanner;
public class ArrayVertical{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    int [] numbers = new int[10];
    int result = 0;
    for (int count = 0; count < 10; count++){
    System.out.print("Enter a number: ");
    int userNumber = inputCollector.nextInt();
    numbers[count] = userNumber;
    }
    
    for(int display = 0; display < numbers.length; display++){
    System.out.println(numbers[display] + " ");
    
    }

   }

}


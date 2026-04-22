import java.util.Scanner;
public class TwoLargest{
    public static void main(String[] args){
    Scanner inputEntry = new Scanner(System.in);
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int count = 1; count <= 10; count++) {
        System.out.print("Enter a number: ");
        int number = inputEntry.nextInt();
        if (number > largest) {
            secondLargest = largest;
            largest = number;
        }
        else if(number > secondLargest ) {
            secondLargest = number;
        }
     }
            System.out.printf("Largest: %d%n", largest);
            System.out.printf("Second Largest: %d", secondLargest);
    } 
}



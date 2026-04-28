/*Write a function that takes in three numbers and gives me the highest of the number*/
import java.util.Scanner;
public class HighestNumber{
    public static void main(String[] args){
    System.out.println(number());
    }

    public static int number(){
    Scanner inputCollect = new Scanner(System.in);
        int highest = 0;
        System.out.print("Enter a number or -1 to exit: ");
        int userNumber = inputCollect.nextInt();
        highest = userNumber;

        while (userNumber != -1) {

        System.out.print("Enter a number or -1 to exit: ");
        userNumber = inputCollect.nextInt();
        if (userNumber > highest) {
        highest = userNumber;
        }

    }
       return highest;
            
    }

}



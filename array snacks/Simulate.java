/*Write a program that simulates the catching of a thief, program end when i shout "thief"*/
import java.util.Scanner;
import java.util.Random;

public class Simulate{
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);
    Random randomNumber = new Random(10);

    while (true) {
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        if(number == randomNumber){
            System.out.print("Thief!")
        }
            break;

    }


    }

}

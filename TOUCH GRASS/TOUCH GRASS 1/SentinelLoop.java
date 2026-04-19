import java.util.Scanner;
public class SentinelLoop{
    public static void main(String[] args) {
    Scanner inputCollect = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        System.out.print("Enter an integer or negative number to exit: ");
        int number = inputCollect.nextInt();

        while (number >= 0) {
                sum += number;
                count++;

        System.out.print("Enter an integer or negative number -1 to exit: ");
        number = inputCollect.nextInt();            

        }
        double average = sum / count;
        System.out.println("Average of positive numbers: " + average);

    }

}

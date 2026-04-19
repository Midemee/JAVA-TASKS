import java.util.Scanner;
public class PowereTwo{
    public static void main(String[] args) {
    Scanner inputCollect = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = inputCollect.nextInt();
    for (int count = 1; count <= number; count++) {
        int result = (int) Math.pow(2, count);
        System.out.println("2 raised to power" + count + "=" + result);
    }

    }

}

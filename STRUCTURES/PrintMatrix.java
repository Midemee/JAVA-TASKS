import java.util.Scanner;

public class PrintMatrix {

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((int)(Math.random() * 2) + " "); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n to print an n-by-n matrix: ");
        int n = input.nextInt();
        printMatrix(n);
    }
}

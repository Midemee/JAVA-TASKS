import java.util.Scanner;
public class StudentInfo{
    public static void main(String[] args) {
    Scanner inputCollect = new Scanner(System.in);
        System.out.print("Enter your major (I- Information management, C- Computer scienec, A- Accounting): ");
        char major = inputCollect.next().charAt(0);
        System.out.print("Enter your year (1- Freshman, 2- Sophomore, 3- Junior, 4 = Senior): ");
        int year = inputCollect.nextInt();
        System.out.printf("%c%n%d%n", major, year);

    }

}

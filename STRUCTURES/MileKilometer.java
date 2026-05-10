import java.util.Scanner;

public class MileKilometer {

    public static double mileToKilometer(double mile) {
        return mile * 1.60934;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer * 0.62137;
    }

    public static void main(String[] args) {

        System.out.println("2 miles = " + mileToKilometer(2) + " kilometers");
        System.out.println("2 kilometers = " + kilometerToMile(2) + " miles");

        System.out.println();


        System.out.println("Miles\t\tKilometers\t|\tKilometers\tMiles");
        
        for (int index = 1; index <= 10; index++) {
            System.out.printf("%-8d\t%.4f\t\t|\t%-8d\t%.4f%n", index, mileToKilometer(index), index, kilometerToMile(index));
        }
    }
}

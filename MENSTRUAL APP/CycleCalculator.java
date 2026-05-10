import java.util.Scanner;

public class CycleCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        char choice = 'y';

        while (choice == 'y') {
            System.out.print("\nEnter Cycle Length (21-35): ");
            int cycleLength = inputCollector.nextInt();

            if (cycleLength < 21 || cycleLength > 35) {
                System.out.println("Out of normal menstrual circle length. Kindly consult a doctor.");
            } else {
                System.out.print("Enter Start Day (1-31): ");
                int day = inputCollector.nextInt();

                System.out.println("\n--- Results     (Days) ---");
                
                int ovulationDay = cycleLength - 14;

                calculateDay("Next Period:  ", day, cycleLength);
                calculateDay("Ovulation:    ", day, ovulationDay);
                calculateDay("Fertile Start (6 - 7 days fertile window):", day, ovulationDay - 5);
                calculateDay("Safe Period (Ends a day before your next cycle):  ", day, ovulationDay + 2);

                System.out.println("\nDISCLAIMER: This is an estimate. Safe periods are not 100% accurate.");
            }

            System.out.print("\nCalculate again? (y/n): ");
            choice = inputCollector.next().toLowerCase().charAt(0);
        }
        System.out.println("Goodbye!");
    }

    public static int calculateDay(String label, int startDay, int daysToAdd) {
        int resultDay = startDay + daysToAdd;

        while (resultDay > 31) {
            resultDay -= 31;
        }
       
        while (resultDay <= 0) {
            resultDay += 31;
        }

        System.out.println(label + " Day " + resultDay);
        return resultDay;
    }
}

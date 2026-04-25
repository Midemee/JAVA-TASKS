import java.util.Scanner;
public class PizzaWahala{
    public static void main(String[] args){
    Scanner inputCollector = new Scanner(System.in);
    displayMenu();
    System.out.printf("%nEnter your pizza choice from 1-4: ");
    int pizzaChoice = inputCollector.nextInt();

    System.out.printf("%nEnter the number of guests: ");
    int guestNumbers = inputCollector.nextInt();
    
    calculateOrder(pizzaChoice, guestNumbers);
        
   }

    public static void displayMenu() {
        System.out.println("WELCOME TO IYA ARAMIDE PIZZA JOINT");
        System.out.println("Pizza Type   Number Of Slices   Price Per Box");
        System.out.println("Sapa Size    4                  2,500");
        System.out.println("Small Money  6                  2,900");
        System.out.println("Big Boys     8                  4,000");
        System.out.println("Odogwu       12                 5,200");
        
}

    public static void calculateOrder(int pizzaChoice, int guestNumbers){
        String pizzaType = "";
        int slices = 0;
        int price = 0;

        switch(pizzaChoice){
            case 1:
                pizzaType = "Sapa Size";
                slices = 4;
                price = 2500;
                break;

            case 2:
                pizzaType = "Small Money";
                slices = 6;
                price = 2900;
                break;

            case 3:
                pizzaType = "Big Boys";
                slices = 8;
                price = 4000;
                break;

            case 4:
                pizzaType = "Odogwu";
                slices = 12;
                price = 5200;
                break;

            default:
                System.out.println("Invalid, Please restart and pick from 1-4");
                return;

        }

        int numberOfBoxes = 0;
        int leftOver = 0;
        int remainder = guestNumbers % slices;

        if (remainder == 0) {
        numberOfBoxes = guestNumbers / slices;
        leftOver = 0;
        }
        else {
        numberOfBoxes = (guestNumbers / slices) + 1;
        leftOver = slices - remainder;
        }
        
        int totalPrice = numberOfBoxes * price;
        

        System.out.printf("%nORDER DETAILS%nTotal Price: %d%nLeftover: %d%nNumber of Boxes: %d%n", totalPrice, leftOver, numberOfBoxes);
    }
}

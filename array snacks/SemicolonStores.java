double vat_rate = 0.075;

public static String[] getCustomerDetails() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter customer's name: ");
    String customer_name = input.nextLine();

    System.out.print("Enter cashier's name: ");
    String cashier_name = input.nextLine();

    System.out.print("Enter discount rate: ");
    double discount_rate = input.nextDouble();

    return new String[]{customer_name, cashier_name, String.valueOf(discount_rate)};
}

public static Map<String, List<Double>> addItems() {
    Scanner input = new Scanner(System.in);
    List<String> products = new ArrayList<>();
    List<Integer> quantities = new ArrayList<>();
    List<Double> prices = new ArrayList<>();
    List<Double> totals = new ArrayList<>();

    while (true) {
        System.out.print("\nEnter product's name: ");
        String product = input.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price: ");
        double price = input.nextDouble();

        double total = quantity * price;

        products.add(product);
        quantities.add(quantity);
        prices.add(price);
        totals.add(total);

        input.nextLine();

        System.out.print("Add another item? (yes/no): ");
        String user_choice = input.nextLine().toLowerCase();

        if (user_choice.equals("no")) {
            break;
        }
    }

    Map<String, List<Double>> data = new HashMap<>();

    return data;
}

public static void printReceipt(String cashier_name, String customer_name, List<String> products, List<Integer> quantities, List<Double> prices, List<Double> totals) {
    System.out.println("SEMICOLON STORES");
    System.out.println("MAIN BRANCH");
    System.out.println("Location: 312, Herbert Macaulay way, sabo Yaba, Lagos");
    System.out.println("Tel: 03293828343");
    System.out.println("Cashier: " + cashier_name);
    System.out.println("Customer Name: " + customer_name);
}

public static void main(String[] args) {
    String[] details = getCustomerDetails();
    String customer_name = details[0];
    String cashier_name = details[1];
    double discount_rate = Double.parseDouble(details[2]);

    Map<String, List<Double>> items = addItems();

}


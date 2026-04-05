public class GratuityRate{
    public static void main(String[] args) {
	int subtotal = 10;
	double gratuityRate = 0.12;
	double gratuity = (double)subtotal * gratuityRate;
	double total = (double)subtotal + gratuity;

	System.out.printf("Gratuity= %.2f%nTotal= %.2f", gratuity, total);
    }
}
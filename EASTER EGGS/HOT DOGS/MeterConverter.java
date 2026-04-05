public class MeterConverter{
    public static void main(String[] args) {
	int meters = 10;
	double feet = (double)meters * 3.2786;
	
	System.out.printf("%dmeters = %.2ffeet", meters, feet);
    }
}
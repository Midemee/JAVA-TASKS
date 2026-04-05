public class Converter{
    public static void main(String[] args) {
	int miles = 5;
	double kilometers = (double)miles * 1.6;
	System.out.printf("%dmiles = %.2fkm", miles, kilometers);
    }
}
public class Volume{
    public static void main(String[] args) {
	int length = 5;
	//double area = Math.sqrt(3) / 4 * Math.pow(length, 3);
	double area = 1.73 / 4 * length * length * length;

	System.out.printf("%.2f", area);
    }
}
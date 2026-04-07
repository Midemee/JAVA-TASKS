import java.util.Scanner;
public class ByteConversion{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in bytes: ");
	double bytes= input.nextDouble();

	double kilobytes = bytes / 1024;
	double megabytes = kilobytes / 1024;
	double gigabytes = megabytes / 1024;
	System.out.printf("Bytes: %.2f%nKilobytes: %.2f%nMegabytes: %.2f%nGigabytes: %.2f", bytes, kilobytes, megabytes, gigabytes);

    }
} 
import java.util.Scanner;
public class Speed{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter speed in km/h: ");
	int speed = input.nextInt();

	if (speed == 0) {
	System.out.println("Stationary");
	}
	else if (speed >=1 && speed <= 40) {
	System.out.println("Slow");	
	}
	else if (speed <= 80) {
	System.out.println("Moderate");	
	}
	else if (speed <= 120) {
	System.out.println("Fast");	
	}
	else if (speed > 120) {
	System.out.println("Dangerously Fast");	
	}
	else {
	System.out.println("Invalid Speed");	
	}
    }
} 
import java.util.Random;
public class Rainbow{
    public static void main(String[] args) {
    Random randomNum = new Random();
	int number;
	number = randomNum.nextInt(1, 8);

	String color;
	
	if (number == 1) {
	color = "Blue";
	}
	else if (number == 2) {
	color = "Green";
	}
	else if (number == 3) {
	color = "Orange";
	}
	else if (number == 4) {
	color = "red";
	}
	else if(number == 5) {
	color = "Violet";
	}
	else if (number == 6) {
	color = "Yellow";
	}
	else {
	color = "Indigo";
	}

	System.out.printf("Number %d is: %s color", number, color);
    }
}
import java.util.Random;
public class TwoRandoms{
    public static void main(String[] args) {
    Random randomNum = new Random();
	int numOne = randomNum.nextInt(12);
	int numTwo = randomNum.nextInt(12);

	int difference;

	if (numOne > numTwo) {	
	difference = numOne - numTwo;
	}
	else {
	difference = numTwo - numOne;
	}
	System.out.println(difference);
    }
}
import java.util.Random;
public class RandomPoint{
    public static void main(String[] args) {
    Random randomPoint = new Random();
	int point = randomPoint.nextInt(50) * 150;

	System.out.println(point);
    }
}
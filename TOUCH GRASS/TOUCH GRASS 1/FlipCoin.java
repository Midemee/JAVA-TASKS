import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        
        int heads = 0;
        int tails = 0;
        int totalFlips = 1000000;
        
        for (int counter = 0; counter < totalFlips; counter++) {
            int flip = randomNumber.nextInt(2);
            
            if (flip == 0) {
                heads++;
            }
            else {
                tails++;
            }
        }
        
        System.out.printf("Total Flips: %d%n Heads: %d%n Tails: %d%n", totalFlips, heads, tails);

    }
}

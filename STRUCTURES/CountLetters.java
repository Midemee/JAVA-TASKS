import java.util.Scanner;

public class CountLetters {

    public static int countLetters(String word) {
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            char character = word.charAt(index);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        System.out.println("Number of letters in \"" + word + "\" is " + countLetters(word));
    }
}

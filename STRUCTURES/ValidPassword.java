import java.util.Scanner;

public class ValidPassword {

    public static boolean isValidPassword(String password) {
        if (password.length() < 10)
            return false;

        int digitCount = 0;

        for (int index = 0; index < password.length(); index++) {
            char character = password.charAt(index);

            if (!Character.isLetterOrDigit(character))
                return false;

            if (Character.isDigit(character))
                digitCount++;
        }

        if (digitCount < 3)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}

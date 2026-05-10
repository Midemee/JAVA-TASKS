import java.util.Scanner;

public class PhoneKeypad {

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C')
            return 2;
        else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F')
            return 3;
        else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I')
            return 4;
        else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L')
            return 5;
        else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O')
            return 6;
        else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S')
            return 7;
        else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V')
            return 8;
        else 
            return 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phone number string: ");
        String phoneNumber = input.nextLine();

        String result = "";

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += getNumber(ch); 
            } else if (ch >= 'a' && ch <= 'z') {
                result += getNumber((char)(ch - 32));
            } else {
                result += ch; 
            }
        }

        System.out.println("The translated number is: " + result);
    }
}

public class Palindrome{
    public static boolean isPalindrome(int number){
        if(number < 10000 && number > 99999){
            return false;
        }
        else{
        int firstStep = number % 10;
        number /= 10;
        int secondStep = number % 10;
        number /= 10;
        int thirdStep = number % 10;
        number /= 10;
        int fourthStep = number % 10;
        number /= 10;
        int fifthStep = number % 10;
        number /= 10;

        if (firstStep == fifthStep) {
            return true;
        }

        }

    }

    public static void main(String[]args){
    System.out.println(isPalindrome(24324));
    System.out.println(isPalindrome(54145));
    }

}

public class Palindrome {

    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); 
        System.out.println(isPalindrome("hello"));  
        System.out.println(isPalindrome("madam"));   
    }
}

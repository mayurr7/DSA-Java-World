package Strings;

public class isPalindromeSentence125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        int start = 0;
        int last = s.length() - 1;

        while (start < last) {
            while (start < last && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;

            }

            while (start < last && !Character.isLetterOrDigit(s.charAt(last))) {
                last--;

            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) {
                return false;
            }
            start++;
            last--;
        }
        return true;

    }
}

package Math;

public class isPalindrome9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        int reverseInt = 0;
        int n = x;
        while (x > 0) {
            int lastDigit = x % 10;
            reverseInt = reverseInt * 10  + lastDigit;
            x = x /10;
        }
        if(n == reverseInt){
            return true;
        }
        return false;
    }
}

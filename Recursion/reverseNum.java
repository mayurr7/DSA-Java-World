package Recursion;

public class reverseNum {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1234));
        System.out.println(sum);
    }

    static int sum = 0;

    static void reveNum(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reveNum(n / 10);

    }

    // check palindrome
    static boolean isPalindrome(int n) {
        reveNum(n);
        if (n == sum) {
            return true;
        }
        return false;

    }

}

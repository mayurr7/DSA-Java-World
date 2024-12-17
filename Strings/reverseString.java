package Strings;

public class reverseString {
    public static void main(String[] args) {
        reverseMethod1("ABCDEFG");
    }

    public static void reverseMethod1(String input){
        String ans ="";
        for (int i = 0; i < input.length(); i++) {
            ans = input.charAt(i) +ans;
        }

        System.out.println(ans);
    }

    public static void reverseMethod2(String input){
        StringBuilder ans = new StringBuilder(input);
        int n = ans.length();
        for (int i = 0; i < n/2; i++) {
            char firstChar = ans.charAt(i);
            char lastChar = ans.charAt(n-1-i);

            ans.setCharAt(i, lastChar);
            ans.setCharAt(n-1-i, firstChar);
        }
        System.out.println(ans.toString());
    }
}

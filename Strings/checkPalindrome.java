package Strings;

public class checkPalindrome {
    public static void main(String[] args) {
        String input = "naMaN";
        System.out.println(checkIfPalindrome(input));
        System.out.println(checkIfPalindromeCapitalSmall(input));
    }

    static boolean checkIfPalindrome(String input){
                    // String ans = "";

                    // for (int i = 0; i < input.length(); i++) {
                    //     ans = input.charAt(i) + ans;
                    // }
                    // System.out.println(ans);
                    // if(ans.equals(input)){
                    //     return true;
                    // }else
                    // return false;

            int start = 0;
            int end = input.length()-1;
            while (start < end) {
                if(input.charAt(start) != input.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }           
            return true;
    }

    static boolean checkIfPalindromeCapitalSmall(String input1){
        String input = input1.toLowerCase();
        int start = 0;
        int end = input.length()-1;
        while (start < end) {
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }           
        return true;
    }
}

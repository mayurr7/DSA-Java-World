package Strings;

import java.util.Arrays;

public class largestOddString1903 {
    public static void main(String[] args) {
       String num = "5932";
      System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        int n = num.length()-1;

        while (n >= 0) {
            int digit = num.charAt(n) + '0';
            if(digit % 2 == 1){
                return num.substring(0, n+1);
            }
            n--;
        }return "";

       
    }
}

package Strings;

import java.util.Arrays;

public class reverseString344 {
    public static void main(String[] args) {
        char s[] = {'h','e','l'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int l = 0; int e = s.length-1;
        while (l < e) {
            char temp = s[l];
            s[l] = s[e];
            s[e] = temp;
            l++;
            e--;
        }
       
        
    }
}

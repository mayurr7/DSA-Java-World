package Strings;

import java.util.Arrays;

public class longestPrefix14 {
    public static void main(String[] args) {
        String strs[] = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null){
            return "";
        }
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if(first[i] != last[i]){
                break;
            }
         result.append(first[i]);
            
        }
        return result.toString();
    }
}

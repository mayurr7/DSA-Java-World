package Strings;


public class numOfStrings1967 {
    public static void main(String[] args) {
        String[] pattern = {"a","a","a"};
        String word = "ab";
        System.out.println((numOfStrings(pattern, word)));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
            for (int i = 0; i < patterns.length; i++) {
               if(word.contains(patterns[i])){
                count++;
               }
            }
            return count;
    }
}

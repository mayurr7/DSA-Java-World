package Strings;

public class subStrings {
    public static void main(String[] args) {
      printAllSubStrings("abc");
    }
    public static void printAllSubStrings(String input){
        int n = input.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}

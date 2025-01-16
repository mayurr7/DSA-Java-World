package Strings;

public class titleToNumber171 {
    public static void main(String[] args) {
        String columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}

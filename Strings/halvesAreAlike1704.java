package Strings;


public class halvesAreAlike1704 {
    public static void main(String[] args) {
        String s= "";
        System.out.println(halvesAreAlike(s));

    }
    public static boolean halvesAreAlike(String s) {
        if(s.length()==0) return false;

        int middel = s.length()/2;
        String a = s.substring(0, middel);
        String b = s.substring(middel);
        String vowels ="aeiouAEIOU";
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(vowels.indexOf(ch) != -1){
                countA++;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if(vowels.indexOf(ch) != -1){
                countB++;
            }
        }

        return (countA == countB);
    }
}

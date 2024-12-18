package Strings;

public class reverseWord151 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}

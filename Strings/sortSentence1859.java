package Strings;


public class sortSentence1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {

        String[] words = s.split(" ");

        String[] sortedWord = new String[words.length];

        for(String word : words){
           int index = word.length()-1;

           int position = word.charAt(index) - '0';


           sortedWord[position - 1] = word.substring(0, index);

        }
        return String.join(" ", sortedWord);
    }
}

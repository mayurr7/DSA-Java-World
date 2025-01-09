package Strings;
public class arrayStringsAreEqual1662 {
    public static void main(String[] args) {
        String[] word1= {"ab", "cd"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            String wordArr1 = String.join("", word2);
            String wordArr2 = String.join("", word1);

            if(wordArr1.equals(wordArr2)){
                return true;
            }
            return false;
    }
}

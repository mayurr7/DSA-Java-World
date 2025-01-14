package Strings;


public class reverseWords557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println((reverseWords(s)));
    }

    public static String reverseWords(String s) {
        String sArr[] = s.split(" ");
                    // for (int i = 0; i < sArr.length; i++) {
                    //     char ch[] = sArr[i].toCharArray();

                    //     int start = 0;
                    //     int e = ch.length - 1;
                    //     while (start < e) {
                    //         char temp = ch[start];
                    //         ch[start] = ch[e];
                    //         ch[e] = temp;
                    //         start++;
                    //         e--;
                    //     }
                    //     sArr[i] = new String(ch);

                    // }


        //@another approch
        StringBuilder result = new StringBuilder();
        for( String word: sArr){
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().append(" "));
        }
        return result.toString().trim();
    }
}

package Strings;

public class reverseStr541 {

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverseStr(s, 2));
    }
    public static String reverseStr(String s, int k) {
        char sArr[] = s.toCharArray();
        int l = sArr.length;
        for (int i = 0; i < l; i += 2 * k) {
            int start = i; int end = Math.min(i+k-1, l-1);
            while (start < end) {
                 char temp = sArr[start];
                sArr[start] = sArr[end];
                sArr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(sArr);
    }
}
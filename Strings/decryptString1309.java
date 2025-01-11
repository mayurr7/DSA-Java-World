package Strings;

public class decryptString1309 {
    public static void main(String[] args) {
        String  s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int e = s.length();
        int i =0;
        while (i < e) {
            if((i+2) < e && s.charAt(i+2) == '#'){
                String str = s.substring(i, i+2);
                int temp = Integer.parseInt(str);
                char ch = (char)(96 + temp);
                sb.append(ch);
                i+=3;
            }else{
                char ch = s.charAt(i);
                sb.append((char)(96 + ch - '0'));
                i++;
            }
        }
        return sb.toString();
    }
}

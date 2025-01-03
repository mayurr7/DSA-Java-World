package Strings;

import java.util.HashMap;

public class isIsomorphic205 {
    public static void main(String[] args) {
        String s = "for";
         String t = "bar";

         System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char orignal = s.charAt(i);
            char replacment = t.charAt(i);

            if(!map.containsKey(orignal)){
                if (!map.containsValue(replacment)) {
                    map.put(orignal, replacment);
                }else{
                        return false;
                }
            }else{
                char mapedChar = map.get(orignal);
                if(mapedChar != replacment){
                    return false;
                }
            }
           
        } return true;
    }
}

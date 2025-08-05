package Strings;

public class isLongPressedName925 {
    public static void main(String[] args) {
        
    }

    public boolean isLongPressedName(String name, String typed) {
        int i = 0; int j =0;
        while (i < name.length()) {
            char[] ch = name.toCharArray();
            char[] ch2 = typed.toCharArray();

            if(ch[i] == ch2[j]){
                j++;
            }else{
                i++;
            }
        }
    }
}

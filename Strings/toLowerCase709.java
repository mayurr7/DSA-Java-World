package Strings;

public class toLowerCase709 {
    public static void main(String[] args) {
        String s ="MAYUR";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
    //    StringBuilder result = new StringBuilder();

    //     for(int i =0; i < s.length(); i++){
    //         char ch = s.charAt(i);
    //         if(ch >= 'A' && ch<= 'Z'){
    //            result.append(Character.toLowerCase(ch));
    //         }else{
    //             result.append(ch);
    //         }
    //     }
    //     return result.toString();

    return s.toLowerCase();
    }
}

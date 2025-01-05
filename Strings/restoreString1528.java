package Strings;

public class restoreString1528 {
    public static void main(String[] args) {
        String s ="codeleet";
        int[] indices ={4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] newString = new char[indices.length];

        for (int i = 0; i < newString.length; i++) {
            newString[indices[i]] = s.charAt(i);
        }

        return new String(newString);
    }
}

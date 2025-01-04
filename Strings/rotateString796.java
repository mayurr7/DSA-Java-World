package Strings;

public class rotateString796 {

    public static void main(String[] args) {
         String s = "aabb";
         String goal = "bbaa";
         System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal){
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
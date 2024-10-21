package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int i = n; i >= 0; i--) {
            int space = n-i;
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}

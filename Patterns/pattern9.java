package Patterns;

public class pattern9 {
    public static void main(String[] args) {
        pattern(9);
    }
    static void pattern(int n){
        for (int i = n; i >= 0; i--) {
           for(int space = 1 ; space <= n - i; space++){
            System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
            System.out.print(" *");
            
           }
           i--;
            System.out.println();
        }
    }
}

package Patterns;

public class pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n-i; space++) {
                System.out.print("  ");
            } 
            for (int j = i; j >0; j--) {
                System.out.print(j +" ");
            }
            for (int j = 2; j <= i; j++) {           
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

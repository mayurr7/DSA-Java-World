package Patterns;

public class pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i < 2*n; i++) {
            int totalCol = i > n ? 2 * n -i : i;
            int spaces = n - totalCol;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

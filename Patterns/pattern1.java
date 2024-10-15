package Patterns;

public class pattern1 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package Patterns;

public class pattern3 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int i = n; i >= 0 ; i--) {
            for (int j = i; j >= 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

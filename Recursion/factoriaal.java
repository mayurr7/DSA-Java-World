package Recursion;

public class factoriaal {
    public static void main(String[] args) {
        System.out.println(factor(6));
    }

    static int factor(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factor(n - 1);

    }
}

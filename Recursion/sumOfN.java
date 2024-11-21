package Recursion;

public class sumOfN {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    static long sumOfSeries(long n) {
        // code here

        if(n == 1){
            return 1;
        }

        return (n * n * n) + sumOfSeries(n - 1);
    }
}

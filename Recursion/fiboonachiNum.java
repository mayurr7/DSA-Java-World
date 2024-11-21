package Recursion;

public class fiboonachiNum {
    public static void main(String[] args) {
        System.out.println(fibbo(5));
    }

    static int fibbo(int n){
        // if(n < 2) return n;

        // return fibbo(n - 1) + fibbo(n - 2);

        return (int) Math.round(Math.pow((1+ Math.sqrt(5)) / 2, n)/Math.sqrt(5));

    }

}

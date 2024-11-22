package Recursion;

public class product {
    public static void main(String[] args) {
        System.out.println(productNum(123 ));
    }
    static int  productNum(int n){
        if(n % 10 == n){
            return n;
        }

        return (n % 10) * productNum(n/10);
    }
}

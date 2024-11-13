package Recursion;

public class printNum {
    public static void main(String[] args) {
        fun(1);
    }
     static void fun(int n){
        if(n ==11){
            return;
        }

        System.out.println(n);
        fun(n+1);
     }
}

package Patterns;

public class pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i =n; i >= 0 ;i--){
            for(int space = i; space <= n; space++){
                System.out.print(" ");
            }
            for(int j = 1; j<= (2 * i -1); j++){
                if(j == 1 || j == (2 * i-1) || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
   
        }
    }
}

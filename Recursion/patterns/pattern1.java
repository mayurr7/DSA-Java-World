package Recursion.patterns;

public class pattern1 {
    public static void main(String[] args) {
        pattern(5,0);
    }
    static void pattern( int r, int c){
        if(r == 0){
            return;
        }
        
        if(c < r){
            System.out.print(" *");
            pattern(r, c+1);
        }else{
            System.out.println();
            pattern(r-1, 0);
        }
    }
}

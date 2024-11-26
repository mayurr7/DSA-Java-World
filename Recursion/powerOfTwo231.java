package Recursion;

public class powerOfTwo231 {
    public static void main(String[] args) {
       System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
       
        if(n == 1){
            return true;
        }

        if(n <= 0 || n % 2 != 0){
            return false;
        }

        return isPowerOfTwo(n/2);
        

      
    }
}

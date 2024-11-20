package Math;

public class armstrongNum {
    public static void main(String[] args) {
        System.out.println(isArmstrongNum(9474 ));
    }
    static boolean isArmstrongNum(int x){
        int n = x;
        int temp =0;
        int totelDigit = String.valueOf(x).length();
        while (x > 0) {
            int lastDigit = x % 10;
           temp+= Math.pow(lastDigit, totelDigit);
            x= x/10;
        }
        
        return n == temp;
    }
}

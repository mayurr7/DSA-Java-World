package Math;

public class oddEven {
    public static void main(String[] args) {
        isOddEven(152);
    }
    static void isOddEven(int n){
        if((n & 1) ==1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even Number");
        }
    }
}

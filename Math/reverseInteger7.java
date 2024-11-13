package Math;

public class reverseInteger7 {
    public static void main(String[] args) {
        System.out.println(reverseInteger(1534236469));
    }

    static int reverseInteger(int x){
        long reverseInt = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reverseInt = (reverseInt * 10) + lastDigit;
            x = x / 10;

            if(reverseInt < Integer.MIN_VALUE || reverseInt > Integer.MAX_VALUE){
                return 0;
            }
        }
        return (int)reverseInt;
    }
}

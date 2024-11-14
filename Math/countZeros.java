package Math;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(countZero(100));
    }
    static int countZero(int n){
        int count  =0;
        while (n > 0) {
            if(n % 10 == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}

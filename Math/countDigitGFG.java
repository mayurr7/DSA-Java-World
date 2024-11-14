package Math;

public class countDigitGFG {
    public static void main(String[] args) {
        System.out.println(countDigit(100));
    }

    static int countDigit(int n) {
        int count = 0;
        int m = n;
        while (m > 0) {

            int lastDigit = m % 10;
            if (lastDigit != 0 && n % lastDigit == 0) {
                count++;
            }
            m = m / 10;

        }
        return count;

    }
}

package Array;

import java.util.Arrays;

class sumZero1304 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }

    public static int[] sumZero(int n) {
        int array[] = new int[n];
        int value = n / 2;
        for (int i = 0; i < n / 2; i++) {
            array[i] = -value + i;
            array[n - i -1] = value- i;
        }

        if(n % 2 == 1){
            array[n / 2] = 0;
        }
        return array;
        
    }
}
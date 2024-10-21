package Array;

import java.util.Arrays;

public class concatenationArray1929 {
    public static void main(String[] args) {
        int nums[] ={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int arr[] = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }
}

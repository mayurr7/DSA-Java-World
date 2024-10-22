package Array;
import java.util.*;
public class runningSum1480 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int runningSum[] = new int[n];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = nums[i] + runningSum[i-1];
        }
        return runningSum;
    }
}

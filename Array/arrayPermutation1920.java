package Array;

import java.util.Arrays;

/**
 * arrayPermutation1920
 */
public class arrayPermutation1920 {
    public static void main(String[] args) {
        int nums[] ={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i =0; i< ans.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    
}
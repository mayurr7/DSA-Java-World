package Array;

import java.util.Arrays;

public class rearrangeArray2149 {
    public static void main(String[] args) {
        int nums[] ={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int nums[]){
            int ans[] = new int[nums.length];
            int p = 0;
            int n =1;
           
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    ans[p] = nums[i];
                    p+=2;
                }else{
                    ans[n] = nums[i];
                    n+=2;
                }
            }
            return ans;
    }
}

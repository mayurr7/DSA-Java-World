package Array;

import java.util.Arrays;

public class removeDuplicates80 {
    public static void main(String[] args) {
        int nums[] ={1,1,1,2,2,2,3,4,4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int k =2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
          
        }return k;
    }
}

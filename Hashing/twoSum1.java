package Array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum1 {
    public static void main(String[] args) {
        int nums[] ={3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer>map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int a = nums[i];
        //     int target1 = target - a;

        //     if(map.containsKey(target1)){
        //         return new int[]{map.get(target1),i};
        //     }
        //     map.put(nums[i], i);
        // }
        // return new int[]{};
        Arrays.sort(nums);

        int left =0; int right = nums.length-1;
        while (left <= right) {
            if(nums[left]  + nums[right] == target){
                return new int[]{left, right};
            }else if(nums[left]  + nums[right] >target){
                right--;
            }else if(nums[left]  + nums[right] <target){
                left++;
            }
        }
        return new int[]{};
        }
}

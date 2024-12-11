package Array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum1 {
    public static void main(String[] args) {
        int nums[] ={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int target1 = target - a;

            if(map.containsKey(target1)){
                return new int[]{map.get(target1),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

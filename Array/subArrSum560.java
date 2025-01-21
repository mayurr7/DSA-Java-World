package Array;

import java.util.HashMap;

public class subArrSum560 {
    public static void main(String[] args) {
        int nums[] ={1,2,3};
        System.out.println(subarraySum(nums, 3));
    }

    public static int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer>map = new HashMap<>();
         int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if(nums[i] == k){
                count+=1;
            }
            int target1 = k - a;

            if(map.containsKey(target1)){
               count+=1;
            }
            map.put(nums[i], i);
        }
        return count;
    }
}

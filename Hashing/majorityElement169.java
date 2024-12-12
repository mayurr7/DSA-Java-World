package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class majorityElement169 {
    public static void main(String[] args) {
        int nums[] ={3,2,3};
       System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
            //    HashMap<Integer, Integer> hash = new HashMap<>();

            //    int n = nums.length;
            //    int count = n / 2;

            //    for (int i : nums) {
            //         hash.put(i, hash.getOrDefault(i, 0)+ 1);

            //         if(hash.get(i) > count){
            //             return i;
            //         }
            //    }
            //    return -1;
//if array sorted majority element always in mid position
            Arrays.sort(nums);
            return nums[nums.length/2];
    }
}

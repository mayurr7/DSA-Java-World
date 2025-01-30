package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement229 {
    public static void main(String[] args) {
      int[]  nums = {1,2};
      System.out.println(majorityElement(nums));
    }
     public static List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
       
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int threshold = nums.length / 3;

        List<Integer>result = new ArrayList<>();
        for(int key: map.keySet()){
            if(map.get(key) > threshold){
                result.add(key);
            }
        }
        return result;
    }
}

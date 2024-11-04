package Array;

import java.util.Arrays;

public class checkNum1608 {
    public static void main(String[] args) {
        int arr[] ={3,5};  
        System.out.println(specialArray(arr));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        for (int x = 0; x <= nums.length; x++) {
            
            int count = 0;

            for(int num : nums){
                if(num >= x){
                    count++;
                }
            }

            if(count == x){
                return x;
            }
        }
        return -1;
    }
}

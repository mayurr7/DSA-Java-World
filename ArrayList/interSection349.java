package ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class interSection349 {
    public static void main(String[] args) {
        int nums1[] ={4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            if(set1.contains(num)){
                resultSet.add(num);;
            }
        }

        int result[] = new int[resultSet.size()];

        int i =0;
        for(int num : resultSet){
            result[i++] = num;
        }
        return result;
    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersect350 {
    public static void main(String[] args) {
        int nums1[] = {5,4,9,4};
        int nums2[] ={4,8,4,9,9};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       
        List<Integer> result = new ArrayList<>();

        int i=0; int j=0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        int Ans[] = new int[result.size()];
        int k =0;
        for(int num : result){
            Ans[k++] = num;
        }

        return Ans;

    }
}

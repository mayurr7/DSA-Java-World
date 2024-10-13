package Array;
import java.util.*;
/**
 * mergeSortedArray88
 */
public class mergeSortedArray88 {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {5};
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j= n-1;
        int k = m + n - 1;
        
         while (j >= 0) {
            if(i>=0 && nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
           
        }
    }
}
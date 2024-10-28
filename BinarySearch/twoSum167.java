package BinarySearch;

import java.util.Arrays;

public class twoSum167 {
    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int start =0; int end =arr.length-1;
    while (start < end) {

        int sum = arr[start] + arr[end];
        if(sum  == target){
            return new int[]{start+1, end+1};
        }else if(sum > target){
            end --;
        }else{
            start++;
        }
    }
    return new int[]{};
    }
}

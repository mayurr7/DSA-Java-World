package Array;

import java.util.Arrays;

public class twoSum167 {
    public static void main(String[] args) {
        int arr[] ={0,1};
        System.out.println(Arrays.toString(twoSum(arr, 1)));
    }
    public static int[] twoSum(int[] arr, int target) {
        // int start = 0; int end = arr.length-1;
        // while (start <= end) {
        //     int sum = arr[start] + arr[end];
        //     if( sum == target){
        //         return new int[]{start+1, end +1};
        //     }else if(sum < target){
        //         start++;
        //     }else if(sum > target){
        //         end--;
        //     }
        // }return new int[]{};//answer is 1 based index not starting from 0;


        //using for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                int sum = arr[i] + arr[j];
                    if( sum == target){
                        return new int[]{i+1, j +1};
                    }else if(sum < target){
                        i++;
                    }else if(sum > target){
                        j--;
                    }
            }
        }
        return new int[]{};
    }
}

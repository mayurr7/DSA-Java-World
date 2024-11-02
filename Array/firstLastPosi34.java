package Array;

import java.util.Arrays;

public class firstLastPosi34 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,3,3};
        System.out.println(Arrays.toString(searchRange(arr, 3)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = searchFirstRange(nums, target);
        int last = searchLastRange(nums, target);

        return new int[]{first,last};
    }

    public static int searchFirstRange(int[] arr, int target) {
       int first =-1; int start =0; int end =arr.length-1;

       while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                first = mid;
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
           
       }
       return first;
       
    } 
    

    public static int searchLastRange(int[] arr, int target) {
        int last =-1; int start =0; int end =arr.length-1;
 
        while (start <= end) {
             int mid = start + (end - start)/2;
             if(arr[mid] == target){
                 last = mid;
                 start = mid +1;
             }else if(arr[mid] < target){
                 start = mid +1;
             }else{
                 end = mid -1;
             }
            
        }
        return last;
        
     } 
}

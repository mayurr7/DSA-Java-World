//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/?envType=problem-list-v2&envId=binary-search
package BinarySearch;

public class findMin154 {
    public static void main(String[] args) {
        int arr[] = {0,4,5,6,7,1,4};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr) {
        int start= 0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==arr[end]){
                end--;
            }
            else if(arr[mid]<arr[end]){
                end= mid;
            }else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}

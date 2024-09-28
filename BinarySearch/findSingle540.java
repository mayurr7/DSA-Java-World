//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
package BinarySearch;

public class findSingle540 {
    public static void main(String[] args) {
        int arr[] = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length-1;
        if(n == 0) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n] != arr[n-1]) return arr[n]; 

        int start = 1;
        int end = arr.length-2;
        while (start <= end) {
            int mid = start + (end -start) / 2;

            if(arr[mid] != arr[mid + 1] && arr[mid] != arr[mid -1]){
                return arr[mid];
            }
            if(mid % 2 == 1 && arr[mid] == arr[mid-1] || mid % 2 == 0 && arr[mid] == arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }return -1;
    }
}
 

package BinarySearch;

public class kThMissing1539 {
    public static void main(String[] args) {
        int arr[] ={4,7,8};
        System.out.println(findKthPositive(arr, 3));
    }
    public static int findKthPositive(int[] arr, int k) {
       int start = 0; int end = arr.length-1;
       while (start <= end) {
            int mid = start + (end - start)/2;
            int tottleMissing = arr[mid] - (mid + 1);

            if(tottleMissing < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
       }
       return end + k +1;
    }
}

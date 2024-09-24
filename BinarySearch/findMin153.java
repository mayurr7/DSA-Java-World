package BinarySearch;

public class findMin153 {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        System.out.println(findMin(arr));
    }
    static int findMin(int arr[]){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<= arr[end]) return arr[0];
      
        while (start <= end) {
            int mid = start + (end -start)/2;
          if(arr[mid] > arr[mid + 1]){
            return arr[mid + 1];
          }else if(arr[mid] < arr[mid -1]){
            return mid;
          }else if(arr[mid] <= arr[end]){
            end = mid - 1;
          }else if(arr[start] <= arr[mid]){
                start = mid + 1;
          }
    }return -1;
}
}

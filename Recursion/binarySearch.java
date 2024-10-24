package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,66,88};
        System.out.println(binarySearchRec(arr, 4,0, arr.length-1));
    }

    static int binarySearchRec(int arr[], int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid]) {
            return binarySearchRec(arr, target, start, mid - 1);
        }
        return binarySearchRec(arr, target, mid + 1, end);
    }
}

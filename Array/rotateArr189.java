package Array;

import java.util.Arrays;

public class rotateArr189 {
    public static void main(String[] args) {
        int arr[] ={1};
        rotate(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[], int k){
        int n =arr.length;
        k = k%n;
        rotateArr(arr, 0, n-1);
        rotateArr(arr, 0, k-1);
        rotateArr(arr,k, n-1);
        

    }
    static void rotateArr(int arr[], int i, int j){
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
           i++;
           j--;
        }
    }



   
}

package Array;

import java.util.Arrays;

public class rotateArr189 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[], int k){
        int n =arr.length-1;
        k = k%n;
        rotateArr(arr, 0, n-k);
        rotateArr(arr,n-k+1, n);
        rotateArr(arr, 0, n);

    }
    static void rotateArr(int arr[], int i, int j){
        while (i < j) {
           swapp(arr, i, j);
           i++;
           j--;
        }
    }

    static void swapp(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;;
    }

   
}

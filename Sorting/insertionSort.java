package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] ={4,5,-2,3,2,55,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swapp(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swapp(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

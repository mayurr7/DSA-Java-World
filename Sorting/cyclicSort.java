package Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int arr[]){
       int i =0;
       while (i < arr.length) {
        int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
            }else{
                i++;
            }
       }
    }

    
    static void swap(int arr[], int i , int j){
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
    }
         
}

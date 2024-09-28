package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={2,3,2,5,6,1};
       Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selection(int arr[]){
       for (int i = 0; i < arr.length; i++) {
        int end = arr.length -i -1;
        int max = findMax(arr, 0, end);
        swap(arr, max, end);
       }
    }
    static int findMax(int arr[], int start, int end){
        int max = start;
       for (int i = start; i <= end; i++) {
        if(arr[max] < arr[i]){
            max = i;
        }
       }
       return max;
    }
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

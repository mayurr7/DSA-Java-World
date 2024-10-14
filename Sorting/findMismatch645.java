package Sorting;

import java.util.Arrays;

public class findMismatch645 {
    public static void main(String[] args) {
        int arr[] ={2,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int arr[]){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j +1 ){
                return new int[] {arr[j], j+1};
            }

        }
        return new int[] {};
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

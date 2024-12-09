package Recursion;

import java.util.Arrays;

public class bubbleSort{
    public static void main(String[] argc) {
        int arr[] ={4,3,2,1};
        bubblecortArr(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblecortArr(int arr[], int r, int c){
        if(r== 0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblecortArr(arr, r, c+1);
        }else{
            bubblecortArr(arr, r-1, c);
        }

    }
}
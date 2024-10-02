package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * findDissapared448
 */
public class findDissapared448 {

    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        findDissapared448 obj = new findDissapared448();  // Create an object of the class
        List<Integer> result = obj.findDisappearedNumbers(arr);  // Call the function
        System.out.println(result);  // Print the result
    }

    
     public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n =  arr.length;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1 ;
            if( arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    

        List<Integer> ans = new ArrayList();
            for(int j =0; j< arr.length; j++){
                if(arr[j] != j+ 1){
                    ans.add(j + 1);
                }
            }      
            return ans;
    }
    
        static void swap(int arr[], int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
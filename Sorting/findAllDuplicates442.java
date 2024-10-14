package Sorting;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates442 {
    public static void main(String[] args) {
        int arr[] ={4,3,2,7,8,2,3,1};
        findAllDuplicates442 obj = new findAllDuplicates442();  // Create an object of the class
        List<Integer> result = obj.findDuplicates(arr);  // Call the function
        System.out.println(result);  // Print the result
    }

     public List<Integer> findDuplicates(int[] arr){
        int i =0;
        int n = arr.length;
        while (i <  n) {
            int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    swapp(arr, i, correct);
                }else{
                    i++;
                }
            }

        
        List<Integer> ans = new ArrayList();
            for(int j =0; j< arr.length; j++){
                if(arr[j] != j+1){
                    ans.add(arr[j]);
                    
                }
            }      
            return ans;
    }

    static void swapp(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

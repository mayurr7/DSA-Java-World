package Sorting;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class findDuplicate287 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));        
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for(int j =0; j< arr.length; j++){
            if(arr[j] != j+1 ){
                return arr[j];
            }
        } return -1;
    }

   public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

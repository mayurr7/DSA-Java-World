//https://leetcode.com/problems/missing-number/
package Sorting;

public class findMissing268 {
    public static void main(String[] args) {
        int arr[] ={0,2,1,4};
        System.out.println(missingNumber(arr));
    }

 
    public static int missingNumber(int[] arr) {
        sort(arr);
        int n = arr.length;
           for(int i =0; i< arr.length; i++){
                if(arr[i] != i){
                    return i;
                }
            }
           return n;
     }
    
        public static void sort(int arr[]){
             int i =0; 
            while(i < arr.length){
                int correctIndex = arr[i];
                if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                    swapp(arr, i, correctIndex);
                }else{
                    i++;
                }
            }
        }
    
        public static void swapp(int arr[] , int i, int j){
             int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
        }
    
}

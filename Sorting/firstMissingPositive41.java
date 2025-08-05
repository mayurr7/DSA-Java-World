package Sorting;

public class firstMissingPositive41 {
    public static void main(String[] args) {
        int arr[] = {2,-3,4,1,1,7};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int arr[]){
        int i =0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swapp(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }


    public static void swapp(int arr[] , int i, int j){
        int temp = arr[i];
           arr[i] =arr[j];
           arr[j] = temp;
   }
}

package Recursion.Array;

public class findTarget {
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,4,5454,65,5,6,4,58};
        System.out.println(find(arr, 55, 0));
    }
    static int find(int arr[], int target, int index){
        if(index == arr.length){
            return -1;
        }
        
        if(arr[index] == target){
            return index;
        }
        else{
                return find(arr, target, index + 1);
            }
       
        
    }
}

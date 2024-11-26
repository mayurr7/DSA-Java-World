package Recursion.Array;

import java.util.ArrayList;

public class targetArryList {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,4};
        ArrayList<Integer> ans = findAllIndex(arr, 0, 4, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllIndex(int arr[], int index, int target, ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
           list.add(index);
        }

        return findAllIndex(arr, index + 1, target, list);
    }
}

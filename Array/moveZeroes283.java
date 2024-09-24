//https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=array&difficulty=EASY
package Array;

import java.util.Arrays;

/**
 * moveZeroes283
 */
public class moveZeroes283 {
    public static void main(String[] args) {
        int arr[] ={0,1,0,3,1,0,52};
       
       System.out.println(Arrays.toString(moveZeroes(arr)));
          
        
    }
   //change int[] method to void for leetcode
    public static int[] moveZeroes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[count++] = arr[i];
            } 
            
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        return arr;
           
    }
}
package Array;

import java.util.Arrays;

public class product238 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(product238Array(arr)));
       
    }
    static int[] product238Array(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

    // calculating left side product
    left[0] = 1;
    for(int i =1; i<n; i++){
        left[i] = left[i - 1] * arr[i-1];
       
    }System.out.println(Arrays.toString(left));

    right[n-1] = 1;
    for(int j = n-2; j >= 0;j--){
        right[j] = right[j + 1] * arr[j + 1];
    }System.out.println(Arrays.toString(right));

    int ans[] = new int[n];
    for(int i = 0; i < n ; i++){
        ans[i] = left[i] * right[i];
    }
    return ans;
    }
}

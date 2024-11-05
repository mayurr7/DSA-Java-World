package Array;

public class checkSorted1752 {
    public static void main(String[] args) {
        int arr[] ={2,1,0};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        
        int n = nums.length;
        if(n < 2 ) return true;

        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > (nums[(i+1) % n])){
                count++;
            }
        }
        return count<=1;
    }
}

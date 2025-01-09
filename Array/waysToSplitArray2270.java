package Array;

public class waysToSplitArray2270 {
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
    }
    public static int waysToSplitArray(int[] nums) {
       long left = 0 , right  = 0;
        int count  = 0;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length-1; i++) {
            left += nums[i];
            right = sum - left;

            if(left >= right){
                count++;
            }
        }
        return count;
    }
}

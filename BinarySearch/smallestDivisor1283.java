package BinarySearch;

public class smallestDivisor1283 {
    public static void main(String[] args) {
        int nums[] = {12,50,11,75,57,12,73,4,69,78};
        System.out.println(smallestDivisor(nums, 649));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1; 
        int max = 1;
        for(int num: nums){
            max = Math.max(num, max);
        }

        while (start < max) {
            int mid =  start +  (max - start)/2;

            if(isDivisible(nums, threshold, mid)){
                max = mid;
            }else{
                start = mid + 1;
            }
        }
        return max;
    }

    private static boolean isDivisible(int nums[], int threshold, int max){
        int sum = 0;
        for(int num : nums){
            sum += (int) Math.ceil((double) num/max);
        }
        return sum <= threshold;
    }
}

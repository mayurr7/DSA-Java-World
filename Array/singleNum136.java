package Array;

public class singleNum136 {
    public static void main(String[] args) {
        int nums[] ={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
           
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count==1) return nums[i];
        }
        return -1;
   }
}

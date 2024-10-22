package Array;

public class goodPair1512 {
    public static void main(String[] args) {
        int nums[] ={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int pair=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    pair++;
                };
            }
        }
        
        if(pair < 0){
            return 0;
        }
        return pair;
    }
}

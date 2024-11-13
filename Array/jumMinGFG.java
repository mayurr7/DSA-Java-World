package Array;

public class jumMinGFG {
    public static void main(String[] args) {
        int nums[] ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(nums));
    }
    static int minJumps(int[] nums) {
        if(nums.length == 1) return 1;
  
          int canReach = 0;
          int count =0;
          
         for(int i = 0; i < nums.length-1; i++){
              if(i > canReach){
                  return -1;
              }
  
              canReach = Math.max(canReach, i + nums[i]);
              count++;
  
              if(canReach >= nums.length-1){
                  return count;
              }
           }
           return -1;
      }
}

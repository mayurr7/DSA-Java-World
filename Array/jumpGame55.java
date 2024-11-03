package Array;

public class jumpGame55 {
    public static void main(String[] args) {
        int nums[] = { 0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int canReach = 0;

      if(nums.length == 1) return true;

        for (int i = 0; i < nums.length; i++) {
            if (i > canReach) {
                return false;
            }

            canReach = Math.max(canReach, i + nums[i]);

            if (canReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

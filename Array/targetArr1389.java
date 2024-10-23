package Array;
import java.util.*;
public class targetArr1389 {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4,0};
        int index[] ={0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
       ArrayList<Integer>resulet = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++) {
            resulet.add(index[i], nums[i]);
        }

        int resuletArr[] = new int[resulet.size()];
        for (int i = 0; i < resulet.size(); i++) {
            resuletArr[i] = resulet.get(i);
        }
        return resuletArr;
    }
}

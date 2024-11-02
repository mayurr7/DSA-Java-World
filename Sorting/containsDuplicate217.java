package Sorting;


import java.util.HashSet;

public class containsDuplicate217 {

    public static void main(String[] args) {
        int nums[] = { 1,4,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> have = new HashSet<>();
        for (int num : nums) {
            if(have.contains(num)){
                return true;
            }
            have.add(num);
        }
        return false;

    }

}
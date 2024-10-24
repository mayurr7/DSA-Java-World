//https://leetcode.com/problems/find-the-highest-altitude/submissions/1432096446/
package Array;
/**
 * highstAltitude1732
 */
public class highstAltitude1732 {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int arr[] = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= gain.length; i++) {
            arr[i] = arr[i - 1] + gain[i - 1];

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

}
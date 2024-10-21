package Patterns;

import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        int ans[][] = pascals(5);
        for (int i = 0; i < ans.length; i++) {
            for (int space = 0; space <= ans.length - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascals(int n) {
        int ans[][] = new int[n][];

        for (int i = 0; i < ans.length; i++) {

            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;

    }
}

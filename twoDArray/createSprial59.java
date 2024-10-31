package twoDArray;

import java.util.*;

public class createSprial59 {
    public static void main(String[] args) {
        int ans[][] = generateMatrix(1);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

        if(n == 1){
            return new int[][]{{1}};
        }

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int k = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = k;
                k++;
            }
            top++;

            // top to bottom
            for (int j = top; j <= bottom; j++) {
                matrix[j][right] = k;
                k++;
            }
            right--;

            // right to left = bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = k;
                k++;
            }
            bottom--;

            // bottm to top = left

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = k;
                k++;
            }
            left++;
        }

        return matrix;

    }
}

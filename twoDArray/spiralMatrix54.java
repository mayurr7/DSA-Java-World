package twoDArray;

import java.util.*;

public class spiralMatrix54 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        spiralMatrix54 sm = new spiralMatrix54();
        System.out.println(sm.spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        if (matrix.length == 0 || matrix == null)
            return ans;

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        int toalEle = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right && toalEle < m * n; i++) {
                ans.add(matrix[top][i]);
                toalEle++;
            }
            top++;

            for (int j = top; j <= bottom && toalEle < m * n; j++) {
                ans.add(matrix[j][right]);
                toalEle++;
            }
            right--;

            for (int i = right; i >= left && toalEle < m * n; i--) {
                ans.add(matrix[bottom][i]);
                toalEle++;
            }
            bottom--;

            for (int j = bottom; j >= top && toalEle < m * n; j--) {
                ans.add(matrix[j][left]);
                toalEle++;
            }
            left++;

        }
        return ans;

    }
}

package twoDArray;

import java.util.Arrays;

public class findRotation1886 {
    public static void main(String[] args) {
        int mat[][] = {
                { 0, 1 },
                { 1, 0 }
        };

        int target[][] = {
                { 1, 0 },
                { 0, 1 }
        };

        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target))
                return true;
            rotateMatrix(mat);
        }
        return false;

    }

    static void rotateMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat.length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

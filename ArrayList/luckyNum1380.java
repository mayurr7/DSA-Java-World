package ArrayList;

import java.util.*;;

public class luckyNum1380 {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 10, 4, 2 },
                { 9, 3, 8, 7 },
                { 15, 16, 17, 12 }
        };

        List<Integer> result = luckyNumbers(matrix);
        System.out.println(result);
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNum = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minNumber = matrix[i][0];
            int minIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minNumber) {
                    minNumber = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean isLucky = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][minIndex] > minNumber) {
                    isLucky = false;
                    break;

                }

            }
            if (isLucky) {
                luckyNum.add(minNumber);
            }

        }
        return luckyNum;
    }
}

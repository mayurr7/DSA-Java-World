package twoDArray;

public class setMatZero73 {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroes(matrix);
        for (int row[] : matrix) {
            for (int num2 : row) {
                System.out.print(num2 + " ");
            }
            System.out.println();
        }

    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean isRowZero = false;
        boolean isColZero = false;

        for (int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                isColZero = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[j][0] == 0) {
                isRowZero = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isRowZero) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }

        if (isColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[0][i] = 0;
            }
        }
    }

}

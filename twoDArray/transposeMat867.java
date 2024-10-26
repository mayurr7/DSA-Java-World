package twoDArray;

public class transposeMat867 {
    public static void main(String[] args) {
        int matrix[][] ={
            { 1, 2 },
            { 4, 5 },
            { 7, 8 }
        };
       int transposeMatrix[][] = transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int answerMatrix[][] = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               answerMatrix[j][i] = matrix[i][j];
            }
        }
        return answerMatrix;
    }
}

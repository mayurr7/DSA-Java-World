package twoDArray;

public class diagonalSum1572 {
    public static void main(String[] args) {
        int mat[][] = {
                // {1,1,1,1},
                // {1,1,1,1},
                // {1,1,1,1},
                // {1,1,1,1}
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        // int n = mat.length;
        // int sum = 0;

        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat.length; j++) {
        //         if (i == j) {
        //             sum += mat[i][j];
        //         }
        //     }

        //     if (i != n) {
        //         sum += mat[i][n];

        //     }
        //     n--;

        // }

       
        int n = mat.length;
        int sum = 0;
         if(n == 1) return mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[i][n -i-1];

            if(i == n /2 && n % 2 == 1 ){
                sum = sum - mat[i][n -i-1];
            }
        }
        return sum;

    }
}

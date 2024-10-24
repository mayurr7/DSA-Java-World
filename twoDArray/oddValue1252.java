package twoDArray;

public class oddValue1252 {
    public static void main(String[] args) {
        int m1 = 2, n1 = 3;
        int[][] indices1 = {{0, 1}, {1, 1}};
        System.out.println(oddCells(m1, n1, indices1));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];

        for(int[] index : indices){
            int ri = index[0];
            int ci = index[1];
        

            for (int j = 0; j < n; j++) {
                matrix[ri][j]++;
            }

            for (int i = 0; i < m; i++) {
                matrix[i][ci]++;
            }


        }
        int odd=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0){
                    odd++;
                }
            }
        }
        return odd;
    }
}

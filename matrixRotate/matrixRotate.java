class Solution {
    public void rotate(int[][] matrix) {
        int swapNum;
        for (int m = 0; m < matrix.length; m++) {
            for (int n = m; n < matrix.length; n++) {
                if (m != n) {
                    //Transpose
                    swapNum = matrix[m][n];
                    matrix[m][n] = matrix[n][m];
                    matrix[n][m] = swapNum;
                }
            }
        }
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix.length / 2; n++) {
                //Columnswap
                swapNum = matrix[m][n];
                matrix[m][n] = matrix[m][matrix.length - n - 1];
                matrix[m][matrix.length - n - 1] = swapNum;
            }
        }
    }
}
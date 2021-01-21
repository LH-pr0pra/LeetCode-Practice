import java.util.ArrayList;

class Solution {
    public void setZeroes(int[][] matrix) {
        //build lists of zero locations
	ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> columns = new ArrayList<Integer>();

	//iterate
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                if (matrix[a][b] == 0) {
                    //record where that zero is
                    rows.add(a);
                    columns.add(b);
                }
            }
        }
        
        //iterate through the entire matrix, replacing
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                if (rows.contains(a) || columns.contains(b)) {
                    matrix[a][b] = 0;
                }
            }
        }
    }
}
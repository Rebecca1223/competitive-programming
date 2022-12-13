import java.util.*;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == 0) {
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                } else if (j == matrix[0].length - 1) {
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j-1]);
                } else {
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
                }
            }
        }
        
        int min = 100000;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[matrix.length-1][i] < min) min = matrix[matrix.length-1][i];
        }
        
        return min;
    }
}
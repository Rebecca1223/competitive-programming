import java.util.*;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = 100000;
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] += Math.min(matrix[i-1][0], matrix[i-1][1]);
            matrix[i][matrix.length-1] += Math.min(matrix[i-1][matrix.length-2], matrix[i-1][matrix.length-1]);
            for (int j = 1; j < matrix.length - 1; j++) {
                matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
                if (i == matrix.length-1) {
                    min = Math.min(min, matrix[i][j]);
                }
            }
        }
        
        return Math.min(min, Math.min(matrix[matrix.length-1][0], matrix[matrix.length-1][matrix.length-1]));
    }
}
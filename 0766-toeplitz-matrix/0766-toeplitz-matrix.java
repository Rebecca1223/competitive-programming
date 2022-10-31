class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowMax = matrix[0].length;
        int columnMax = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            if (diagonalCheck(matrix, 0, i) == false){
                return false;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (diagonalCheck(matrix, i, 0) == false){
                return false;
            }
        }
        return true;
    }
    
    boolean diagonalCheck(int[][] matrix, int row, int col) {
        while (row < matrix[0].length-1 && col < matrix.length-1) {
            if (matrix[col][row] != matrix[col+1][row+1]) {
                return false;
            }
            col++;
            row++;
        }
        return true;
    }
}
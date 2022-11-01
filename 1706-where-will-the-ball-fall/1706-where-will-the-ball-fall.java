class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = fallout(grid, i);
        }
        return answer;
    }
    
    int fallout(int[][] grid, int colStart) {
        int row = 0;
        int col = colStart;
        int maxRow = grid.length-1; //index of right border
        int maxCol = grid[0].length-1; //index of bottom
        while (true) {
            if (row > maxRow) {
                return col;
            }
            
            if (grid[row][col] == 1) { //goes right
                if (col+1 > maxCol) { //goes out of right border
                    return -1;
                } else if (grid[row][col+1] == -1) { //hits V shape
                    return -1;
                } else {
                    col++; //move right
                    row++; //move down
                }
            } else { //goes left
                if (col-1 < 0) { //goes out of left border
                    return -1;
                } else if (grid[row][col-1] == 1) {
                    return -1;
                } else {
                    col--; //move left
                    row++; //move down
                }
            }
        }
    }
}
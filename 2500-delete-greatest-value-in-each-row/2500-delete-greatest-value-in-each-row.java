class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        
        int total = 0;
        
        for (int col = 0; col < grid[0].length; col++) {
            int max = grid[0][col];
            for (int row = 0; row < grid.length; row++) {
                max = Math.max(max, grid[row][col]);
            }
            total += max;
        }
        return total;
    }
}
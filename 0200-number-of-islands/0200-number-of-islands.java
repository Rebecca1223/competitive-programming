class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    islands++;
                    spread(grid, x, y);
                }
            }
        }
        return islands;
    }
    
    void spread(char[][] grid, int x, int y) { // grid[y][x]
        if (grid[y][x] == '0') {
            return;
        }
        
        grid[y][x] = '0';
        
        //check right
        if (x + 1 < grid[0].length) {
            spread(grid, x+1, y);
        }
        
        //check down
        if (y + 1 < grid.length) {
            spread(grid, x, y+1);
        }
        
        //check left
        if (x - 1 >= 0) {
            spread(grid, x - 1, y);
        }
        
        //check up
        if (y - 1 >= 0) {
            spread(grid, x, y-1);
        }
    }
}
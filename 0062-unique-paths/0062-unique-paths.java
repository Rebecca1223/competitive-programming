class Solution {
    public int uniquePaths(int m, int n) {
        int[][] sum = new int[m][n];
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (x - 1 < 0 && y - 1 < 0) {
                    sum[0][0] = 1;
                } else if (x - 1 < 0) {
                    sum[y][x] = sum[y - 1][x];
                } else if (y - 1 < 0) {
                    sum[y][x] = sum[y][x - 1];
                } else {
                    sum[y][x] = sum[y][x - 1] + sum[y - 1][x];
                }
            }
        }
        
        return sum[m-1][n-1];
    }
}
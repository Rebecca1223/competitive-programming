import java.lang.*;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int dp[] = new int[len + 1];
        
        if (len == 2) {
            return Math.min(cost[0], cost[1]);
        } else if (len == 3) {
            return Math.min(cost[0] + cost[2], cost[1]);
        }
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        dp[2] = cost[2] + Math.min(dp[1], dp[0] + dp[2]);
        
        for (int i = 3; i < len; i++) {
            dp[i] = cost[i] + Math.min(dp[i-2], dp[i-1]);
        }
        
        return Math.min(dp[len - 2], cost[len-1] + dp[len - 3]);
    }
}
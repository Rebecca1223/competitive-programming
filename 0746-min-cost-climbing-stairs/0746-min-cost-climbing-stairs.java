import java.lang.*;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int accum[] = new int[len + 1];
        
        if (len == 2) {
            return Math.min(cost[0], cost[1]);
        } else if (len == 3) {
            return Math.min(cost[0] + cost[2], cost[1]);
        }
        
        accum[0] = cost[0];
        accum[1] = cost[1];
        accum[2] = cost[2] + Math.min(accum[1], accum[0] + accum[2]);
        
        for (int i = 3; i < len; i++) {
            System.out.println (accum[i-3] + " " + accum[i-2] + " " + accum[i-1]);
            accum[i] = cost[i] + Math.min(accum[i-2], accum[i-1]);
        }
        
        return Math.min(accum[len - 2], cost[len-1] + accum[len - 3]);
    }
}
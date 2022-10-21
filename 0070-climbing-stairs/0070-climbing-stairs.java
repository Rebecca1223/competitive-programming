class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }

        return prev2;
    }
}
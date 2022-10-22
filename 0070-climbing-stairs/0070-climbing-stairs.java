class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[n+1];
        
        if (n < 2) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        
        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;
        
        for (int i = 3; i < n+1; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        
        return stairs[n];
//         if (n < 2) {
//             return 1;
//         }

//         int prev1 = 1;
//         int prev2 = 2;

//         for (int i = 3; i <= n; i++) {
//             int sum = prev1 + prev2;
//             prev1 = prev2;
//             prev2 = sum;
//         }

//         return prev2;
    }
}
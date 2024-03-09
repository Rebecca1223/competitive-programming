class Solution {
public:
    int climbStairs(int n) {
        vector<int> ways = {1, 2};
        
        if (n == 1) return 1;
        if (n == 2) return 2;
        for (int i = 2; i < n; i++) {
            ways.push_back(ways[i-2] + ways[i-1]);
        }
        
        return ways[n-1];
    }
};
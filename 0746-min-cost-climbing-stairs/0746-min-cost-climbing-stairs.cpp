class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        vector<int> total = {cost[0], cost[1]};
        
        for (int i = 2; i < cost.size(); i++) {
            total.push_back(cost[i] + min(total[i-1], total[i-2]));
        }
        
        return min(total[total.size()-1], total[total.size()-2]);
    }
};
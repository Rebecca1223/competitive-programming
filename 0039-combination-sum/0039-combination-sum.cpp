class Solution {
public:
    void dfs(vector<vector<int>>& output, vector<int> subset, int sum, int target, vector<int> candidates, int cur, int total) {
        if (sum >= target) {
            if (sum == target) output.push_back(subset);
            return;
        }
        if (cur >= total) return;
        
        dfs(output, subset, sum, target, candidates, cur+1, total);
        
        subset.push_back(candidates[cur]);
        dfs(output, subset, sum + candidates[cur], target, candidates, cur, total);
    }
    
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> output;
        int total = candidates.size();

        dfs(output, {}, 0, target, candidates, 0, total);
        
        return output;
    }
};
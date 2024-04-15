class Solution {
public:
    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        int n = startTime.size();
        vector<tuple<int, int, int>> jobs;

        for (int i = 0; i < n; i++) {
            jobs.emplace_back(startTime[i], endTime[i], profit[i]);
        }
        
        sort(jobs.begin(), jobs.end());
        
        for (int i = 0; i < n; i++) {
            startTime[i] = get<0>(jobs[i]);
            endTime[i] = get<1>(jobs[i]);
            profit[i] = get<2>(jobs[i]);
        }

        vector<int> dp(n + 1, 0);
        
        for (int i = n - 1; i >= 0; i--) {
            int ind = lower_bound(startTime.begin(), startTime.end(), endTime[i]) - startTime.begin();
            int take = profit[i] + (ind < n ? dp[ind] : 0);
            int notTake = dp[i + 1];

            dp[i] = max(take, notTake);
        }
        
        return dp[0];
    }
};
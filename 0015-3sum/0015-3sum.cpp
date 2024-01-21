class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        
        vector<vector<int>> result;
        int n = nums.size() - 1;
        
        for (int i = 0; i < nums.size(); i++) {
            int j = i + 1;
            int k = n;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.push_back({nums[i], nums[j], nums[k]});
                    j++;
                    k--;
                    while (j <= n && nums[j] == nums[j-1]) j++;
                    while (k >= 0 && nums[k] == nums[k+1]) k--;
                } else if (sum < 0) {
                    j++;
                    while (j <= n && nums[j] == nums[j-1]) j++;
                } else {
                    k--;
                    while (k >= 0 && nums[k] == nums[k+1]) k--;
                }
            }
            
            while (i < nums.size()-1 && nums[i] == nums[i+1]) i++;
        }
        
        return result;
    }
};
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int sum = 0, max = 0;
        unordered_map<int, int> seen = {{0, -1}};
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            
            if (seen.count(sum) == 1) {
                int temp = i - seen[sum];
                if (temp > max) max = temp;
            } else {
                seen[sum] = i;
            }
        }
        
        return max;
    }
};
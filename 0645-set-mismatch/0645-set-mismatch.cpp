class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        unordered_set<int> seen;
        vector<int> output;
        
        for (auto num : nums) {
            if (seen.count(num) > 0) {
                output.push_back(num);
            } else {
                seen.insert(num);
            }
        }
        
        for (int i = 1; i <= nums.size(); i++) {
            if (seen.count(i) < 1) {
                output.push_back(i);
                break;
            }
        }
        
        return output;
    }
};
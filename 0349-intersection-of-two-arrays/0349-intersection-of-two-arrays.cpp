class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> one(nums1.begin(), nums1.end());
        unordered_set<int> seen;
        vector<int> result;
        
        for (auto num : nums2) {
            if (one.count(num) == 1 && seen.count(num) == 0) {
                result.push_back(num);
                seen.insert(num);
            }
        }
        return result;
    }
};
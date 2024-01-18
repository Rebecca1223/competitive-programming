class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> freq;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            if (freq.find(nums[i]) != freq.end()) {
                freq[nums[i]] = freq[nums[i]] + 1;
            } else {
                freq[nums[i]] = 1;
            }
        }

        vector<int>* order = new vector<int>[n];

        for (auto i : freq) {
            order[i.second - 1].push_back(i.first);
        }

        vector<int> result;

        for (int i = n-1; i >= 0; i--) {
            if (order[i].size() > 0) {
                for (auto e : order[i]) {
                    result.push_back(e);
                }
            }

            if (result.size() == k) break;
        }

        delete[] order;

        return result;
    }
};
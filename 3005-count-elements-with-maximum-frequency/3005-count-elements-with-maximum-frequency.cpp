class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int max = 0;
        int count = 0;
        
        unordered_map<int, int> freq;
        for (auto num : nums) {
            if (freq.count(num) == 1) {
                freq[num] += 1;
            } else {
                freq[num] = 1;
            }
            
            if (freq[num] == max) {
                count += freq[num];
            } else if (freq[num] > max) {
                max = freq[num];
                count = freq[num];
            }
        }
        
        return count;
    }
};
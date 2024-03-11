class Solution {
public:
    string customSortString(string order, string s) {
        unordered_map<char, int> freq;
        vector<char> result;
        
        for (auto c : s) {
            if (freq.count(c) == 1) {
                freq[c] += 1;
            } else {
                freq[c] = 1;
            }
        }
        
        for (auto c : order) {
            if (freq.count(c)  == 1) {
                for (int i = 0; i < freq[c]; i++) {
                    result.push_back(c);
                }
                freq.erase(c);
            }
        }
        
        for (auto [key, value] : freq) {
            for (int i = 0; i < value; i++) {
                result.push_back(key);
            }
        }
        
        string output(result.begin(), result.end());
        return output;
    }
};
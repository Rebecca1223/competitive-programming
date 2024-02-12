class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> index;
        int highest = 0, i = 0, start = 0;
        
        while (i < s.length()) {
            if (index.count(s[i]) == 1) {
                if (i - start > highest) highest = i-start;
                
                int duplicate = index[s[i]];
                for (int j = start; j < duplicate; j++) {
                    index.erase(s[j]);
                }
                    
                start = duplicate + 1;
            }
            index[s[i]] = i;
            i++;
        }
        
        if (i - start > highest) highest = i-start;
        
        return highest;
    }
};
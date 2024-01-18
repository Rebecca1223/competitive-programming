class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> s(nums.begin(), nums.end());
        
        int max = 0;
        
        while (s.size() > 0) {
            int con = 1;
            int up = *begin(s)+1;
            int down = *begin(s)-1;
            
            while (s.count(up) > 0) {
                con += 1;
                s.erase(up);
                up += 1;
            }
            while (s.count(down) > 0) {
                con += 1;
                s.erase(down);
                down -= 1;
            }
            
            s.erase(*begin(s));
            if (con > max) max = con;
        }
        
        return max;
    }
};
class Solution {
public:
    void palin(int& maxLen, pair<int, int>& pos, int start, int end, const string s, const int n) {
        while (true) {
            if (start < 0 || end >= n || s[start] != s[end]) {
                if (end - start - 1 > maxLen) {
                    maxLen = end-start-1;
                    pos = {start+1, end-1};
                }
                break;
            }
            start--;
            end++;
        }
    }
    
    string longestPalindrome(string s) {
        int n = s.length();
        if (n == 1) return s;
        if (n == 2 && s[0] == s[1]) return s;
        
        int maxLen = 0;
        pair<int, int> pos = {0, 0};
        if (n == 3 && s[0] == s[1]) {
            maxLen = 2;
            pos = {0, 1};
        }
        
        for (int i = 2; i < n; i++) {
            int len = 0;
            
            if (s[i] == s[i-1]) { // even
                palin(maxLen, pos, i-1, i, s, n);
            }
            
            if (s[i] == s[i-2]) { // odd
                palin(maxLen, pos, i-2, i, s, n);
            }
        }
        
        return s.substr(pos.first, pos.second-pos.first+1);
    }
};
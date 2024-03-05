class Solution {
public:
    int minimumLength(string s) {
        int start = 0;
        int end = s.length()-1;
        char same = ' ';
        
        while (start < end) {
            if (s[start] == s[end]) {
                same = s[start];
                start++;
                end--;
            } else if (s[start] == same) {
                start++;
            } else if (s[end] == same) {
                end--;
            } else {
                break;
            }
        }
        
        if (start == end && s[start] == same) return 0;
        return start <= end ? end-start+1 : 0;
    }
};
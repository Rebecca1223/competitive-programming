class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        vector<char> one;
        vector<char> zero;
        
        for (auto c : s) {
            if (c == '1') {
                one.push_back('1');
            } else {
                zero.push_back('0');
            }
        }
        
        one.pop_back();
        zero.push_back('1');
        
        string strOne(one.begin(), one.end()); 
        string strZero(zero.begin(), zero.end()); 
        
        return strOne + strZero;
    }
};
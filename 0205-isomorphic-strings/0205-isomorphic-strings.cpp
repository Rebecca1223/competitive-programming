class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.size() != t.size()) return false;
        
        unordered_map<char, char> mp;
        unordered_set<char> used;
        
        for (int i = 0; i < s.size(); i++) {
            if (mp.count(s.at(i)) == 1) {
                if (t.at(i) != mp[s.at(i)]) return false;
            } else {
                if (used.count(t.at(i)) == 1) return false;
                used.insert(t.at(i));
                mp[s.at(i)] = t.at(i);
            }
        }
        
        return true;
    }
};
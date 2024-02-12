class Solution {
public:
    void dfs(vector<vector<int>>& output, vector<int> subarray, unordered_set<int> s) {
        if (s.size() == 1) {
            subarray.push_back(*begin(s));
            output.push_back(subarray);
            return;
        }
        
        vector<int> temp(s.begin(), s.end());
        
        for (int e : temp) {
            subarray.push_back(e);
            s.erase(e);
            
            for (auto e : subarray) {
                cout << e << " ";
            }
            cout << endl;
            
            dfs(output, subarray, s);
            s.insert(e);
            subarray.pop_back();
        }
    }
    
    vector<vector<int>> permute(vector<int>& nums) {
        unordered_set<int> s(nums.begin(), nums.end());
        vector<vector<int>> output;
        
        dfs(output, {}, s);
        
        return output;
    }
};
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int* prefix = new int[nums.size()];
        int* postfix = new int[nums.size()];
        
        int pre = 1;
        int post = 1;
        for (int i = 0; i < nums.size(); i++) {
            pre *= nums[i];
            prefix[i] = pre;
            
            post *= nums[nums.size() - 1 - i];
            postfix[nums.size() - 1 - i] = post;
        }
        
        vector<int> result;
        result.push_back(postfix[1]);
        for (int i = 1; i < nums.size()-1; i++) {
            result.push_back(prefix[i-1]*postfix[i+1]);
        }
        result.push_back(prefix[nums.size()-2]);
        
        delete[] prefix;
        delete[] postfix;
        return result;
    }
};
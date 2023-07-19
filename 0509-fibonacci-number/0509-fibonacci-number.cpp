class Solution {
public:
    int fib(int n) {
        vector<int> nums;
        
        nums.push_back(0);
        nums.push_back(1);
        
        for (int i = 2; i <= n; i++) {
            nums.push_back(nums.at(i-1) + nums.at(i-2));
        }
        
        return nums.at(n);
    }
};
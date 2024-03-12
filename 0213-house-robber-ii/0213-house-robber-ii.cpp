class Solution {
public:
    int sub(vector<int> nums, int start, int end) {
        int n = end-start;
        if (n == 1) return nums[start];
        if (n == 2) return max(nums[start], nums[start+1]);
        if (n == 3) return max(nums[start+1], nums[start] + nums[start+2]);
        nums[start+2] += nums[start];
        
        for (int i = start+3; i < end; i++) {
            nums[i] += max(nums[i-3], nums[i-2]);
        }
        return max(nums[end-1], nums[end-2]);
    }
    int rob(vector<int>& nums) {
        int n = nums.size();
        if (n == 1) return nums[0];
        return max(sub(nums, 0, n-1), sub(nums, 1, n));
    }
};
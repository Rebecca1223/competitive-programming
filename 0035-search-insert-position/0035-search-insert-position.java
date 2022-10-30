class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        return binary(nums, target, len-1, 0);
    }
    
    int binary(int[] nums, int target, int high, int low) {
        if (low > high) {
            return low;
        } else {
            int mid = (high + low)/2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                return binary(nums, target, high, mid+1);
            } else {
                return binary(nums, target, mid-1, low);
            }
        }
    }
}
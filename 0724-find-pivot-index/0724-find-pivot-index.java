class Solution {
    public int pivotIndex(int[] nums) {
        int suffix = 0;
        for (int i = 1; i < nums.length; i++) {
            suffix += nums[i];
        }
        
        int prefix = 0;
        int pivot = 0;
        
        while (prefix != suffix) {
            prefix += nums[pivot];
            pivot++;
            if (pivot >= nums.length) {
                return -1;
            }
            suffix -= nums[pivot];
        }
        return pivot;
    }
}
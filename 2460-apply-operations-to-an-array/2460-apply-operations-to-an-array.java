class Solution {
    public int[] applyOperations(int[] nums) {
        int track = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
            
            if(nums[i] != 0) nums[track++] = nums[i];
        }
        
        if(nums[nums.length-1] != 0) nums[track++] = nums[nums.length-1];
        
        for(int i = track; i < nums.length; i++) nums[i] = 0;
        
        return nums;
    }
}
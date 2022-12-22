class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && seen.contains(-1*nums[i])) {
                if (-1*nums[i] > max) max = -1*nums[i];
            } else if (nums[i] > 0 && seen.contains(-1*nums[i])){
                if (nums[i] > max) max = nums[i];
            } else {
                seen.add(nums[i]);
            }
        }
        return max;
    }
}
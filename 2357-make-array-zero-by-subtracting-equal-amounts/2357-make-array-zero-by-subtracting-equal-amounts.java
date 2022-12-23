class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) seen.add(nums[i]);
        }
        
        return seen.size();
    }
}
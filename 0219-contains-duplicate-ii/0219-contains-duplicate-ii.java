class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsKey(nums[i])) {
                if (i - numbers.get(nums[i]) <= k) {
                    return true;
                }else {
                    numbers.put(nums[i], i);
                }
            } else {
                numbers.put(nums[i], i);
            }
        }
        
        return false;
    }
}
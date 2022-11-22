class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> appears = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            appears.add(nums[i]);
        }
        
        List<Integer> missing = new ArrayList<Integer>();
        
        for (int i = 1; i < nums.length+1; i++) {
            if (!appears.contains(i)) {
                missing.add(i);
            }
        }
        
        return missing;
    }
}
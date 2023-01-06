class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> val = new ArrayList<>();
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        
        for(int i : nums1) {
            a.add(i);
        }
        
        for(int i : nums2) {
            if(a.contains(i) && !val.contains(i)) val.add(i);
            b.add(i);
        }
        
        for(int i : nums3) {
            if((a.contains(i) || b.contains(i)) && !val.contains(i)) val.add(i);
        }
        
        return val;
    }
}
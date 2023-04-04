class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]) num = Math.min(num, nums1[i]);
                num = Math.min(num, Math.min(nums1[i]*10+nums2[j], nums2[j]*10 + nums1[i]));
            }
        }
        return num;
    }
}
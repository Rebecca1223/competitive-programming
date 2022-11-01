class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n  == 0) return;
        
        int i = m + n - 1;
        
        while (i >= 0 && m > 0 && n > 0) {
            if (nums1[m-1] > nums2[n-1]) {
                nums1[i] = nums1[m-1];
                i--;
                m--;
            } else {
                nums1[i] = nums2[n-1];
                i--;
                n--;
            }
        }
        
        while (m > 0) {
            nums1[i] = nums1[m-1];
            i--;
            m--;
        }
        
        while (n > 0) {
            nums1[i] = nums2[n-1];
            i--;
            n--;
        }
    }
}
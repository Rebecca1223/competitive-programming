import java.lang.*;

class Solution {
    public int minimumAverageDifference(int[] nums) {
        if (nums.length == 1) return 0;
        
        long prefix = nums[0];
        int index = 0;
        long remaining = 0;
        
        for (int i = 1; i < nums.length; i++) {
            remaining += nums[i];
        }
        
        long difference = Math.abs(remaining/(nums.length - 1) - prefix);
        
        for (int i = 1; i < nums.length; i++) {
            prefix += nums[i];
            remaining -= nums[i];
            
            long divisor = nums.length - i - 1;
            long newDiff;
            
            if (divisor == 0) {
                newDiff = Math.abs(0 - prefix/(i + 1));
            } else {
                newDiff = Math.abs(remaining/(nums.length - i - 1) - prefix/(i + 1));
            }
            
            if (newDiff < difference) {
                index = i;
                difference = newDiff;
            }
        }
        
        return index;
    }
}
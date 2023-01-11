class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        return gcd(max, min);
    }
    
    public int gcd(int a, int b) {
       if (b == 0) return a;
       return gcd(b, a % b);
    }
}
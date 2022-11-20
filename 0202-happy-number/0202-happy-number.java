class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<Integer>();
        
        int sum = 0;
        int digit;
        
        while (sum != 1) {
            sum = 0;
            while (n != 0) {
                digit = n % 10;
                sum += digit*digit;
                n /= 10;
            }
            if (seen.contains(sum)) {
                return false;
            } else {
                seen.add(sum);
            }
            n = sum;
        }
        
        return true;
    }
}
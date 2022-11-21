class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] == 9) {
            int carry = 1;
            while (carry < len) {
                if (digits[len - carry - 1] == 9) {
                    carry++;
                } else {
                    break;
                }
            }
            
            if (carry == len) {
                int[] big = new int [digits.length + 1];
                for (int i = 0; i < len - carry; i++) {
                    big[i] = digits[i];
                }

                big[big.length - carry - 1]++;
                return big; 
            } else {
                digits[digits.length - carry - 1]++;
                for (int i = digits.length - carry; i < digits.length; i++) {
                    digits[i] = 0;
                }
            }
            
        } else {
            digits[len - 1]++;
        }
        return digits;
    }
}
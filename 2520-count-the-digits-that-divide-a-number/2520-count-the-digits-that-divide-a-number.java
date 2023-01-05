class Solution {
    public int countDigits(int num) {
        int val = 0, temp = num;
        while (temp != 0) {
            if (num % (temp % 10) == 0) val++;
            temp /= 10;
        }
        return val;
    }
}
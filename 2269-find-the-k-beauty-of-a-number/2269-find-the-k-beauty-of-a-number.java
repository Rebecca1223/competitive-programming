class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        int original = num;
        int len = String.valueOf(num).length();
        int divisor = (int)Math.pow(10, (len - k));
        while (num != 0) {
            int temp = num / divisor;
            System.out.println(num + "/" + divisor + " = " + temp);
            if (temp != 0 && original % temp == 0) count++;
            num %= Math.pow(10, len-1);
            len--;
            divisor /= 10;
            if (divisor == 0) break;
        }
        return count;
    }
}
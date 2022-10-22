class Solution {
    public int fib(int n) {
        int[] sum = new int [n+1];
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        sum[0] = 0;
        sum[1] = 1;
        for (int i = 2; i < n+1; i++) {
            sum[i] = sum[i-1] + sum[i-2];
        }
        return sum[n];
    }
}
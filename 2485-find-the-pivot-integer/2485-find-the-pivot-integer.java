class Solution {
    public int pivotInteger(int n) {
        int pre = 1, post = (n*(n+1))/2;
        for (int i = 1; i <= n; i++) {
            if (pre == post) {
                return i;
            } else {
                pre += i+1;
                post -= i;
            }
        }
        return -1;
    }
}
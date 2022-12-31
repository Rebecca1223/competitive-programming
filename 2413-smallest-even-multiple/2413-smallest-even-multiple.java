class Solution {
    public int smallestEvenMultiple(int n) {
        int temp = n;
        while (temp%2 != 0) {
            temp += n;
        }
        return temp;
    }
}
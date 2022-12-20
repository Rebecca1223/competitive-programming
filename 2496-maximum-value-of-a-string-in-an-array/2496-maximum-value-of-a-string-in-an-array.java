class Solution {
    public int maximumValue(String[] strs) {
        int max = 0, temp;
        for (int i = 0; i < strs.length; i++) {
            try {
                temp = Integer.parseInt(strs[i]);
            } catch (NumberFormatException nfe) {
                temp = strs[i].length();
            }
            if (temp > max) max = temp;
        }
        return max;
    }
}
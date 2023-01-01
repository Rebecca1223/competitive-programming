class Solution {
    public String largestGoodInteger(String num) {
        char a, b, c;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length() - 2; i++) {
            a = num.charAt(i);
            b = num.charAt(i + 1);
            c = num.charAt(i + 2);
            if (a == b && b == c) {
                int temp = Integer.parseInt(num.substring(i, i+3));
                if (temp > max) max = temp;
            }
        }
        if (max == 0) return "000";
        if (max < 0) return "";
        return Integer.toString(max);
    }
}
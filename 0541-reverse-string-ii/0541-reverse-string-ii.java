class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int half = k/2;
        if (k > s.length()) k = s.length();
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            temp = new StringBuilder(s.substring(i, i + k));
            str.replace(i, i + k, (temp.reverse()).toString());
            i += 2*k;
            if (s.length() - i < k) k = s.length() - i;
        }
        
        return str.toString();
    }
}
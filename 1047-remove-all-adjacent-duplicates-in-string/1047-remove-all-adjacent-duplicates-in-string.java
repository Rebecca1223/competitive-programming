class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        int len = str.length();
        int i = 0;
        
        if (len < 2) {
            return s;
        }
        
        while (0 <= i && i < len-1) {
            if (str.charAt(i) == str.charAt(i+1)) {
                str.delete(i, i+2);
                if (i != 0) {
                    i--;
                }
            } else {
                i++;
            }
            len = str.length();
        }
        
        return str.toString();
    }
}
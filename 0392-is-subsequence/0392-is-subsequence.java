class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        
        if (t.length() < s.length()) {
            return false;
        }
        
        int sIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)){
                sIndex++;
            }
            if (sIndex == s.length()) {
                return true;
            }
        }
        
        return false;
    }
}
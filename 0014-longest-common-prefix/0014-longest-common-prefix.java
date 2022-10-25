import java.lang.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if (strs[0].equals(strs[strs.length-1])){
            return strs[0];
        }
        
        int i = 0;
        int shorter = Math.min(strs[0].length(), strs[strs.length-1].length());
        
        while(i < shorter){
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        
        if (shorter == 0) {
            return "";
        } else if (i == 0 && strs[0].charAt(0) != strs[strs.length-1].charAt(0)) {
            return "";
        }
        return strs[0].substring(0, i);
    }
}
import java.lang.*;

class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean complete = remove(str);
        
        while (!complete) {
            complete = remove(str);
        }
        
        return str.toString();
    }
    
    boolean remove(StringBuilder str) {
        if (str.length() < 2) {
            return true;
        }
        
        for (int i = 0; i < str.length() - 1; i++) {
            if (Math.abs(str.charAt(i) - str.charAt(i+1)) == 32) {
                str.delete(i, i+2);
                break;
            }
            
            if (i + 1 == str.length() - 1) {
                System.out.println("hi");
                return true;
            }
        }
        
        return false;
    }
}
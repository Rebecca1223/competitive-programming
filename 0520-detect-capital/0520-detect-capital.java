class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') { 
            if (word.length() > 1) {
                if (word.charAt(1) < 'a') { // uppercase
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) >= 'a') return false;
                    }
                } else { // lowercase
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) < 'a') return false;
                    }
                }
            }
        } else { // lowercase
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < 'a') return false;
            }
        }
        return true;
    }
}
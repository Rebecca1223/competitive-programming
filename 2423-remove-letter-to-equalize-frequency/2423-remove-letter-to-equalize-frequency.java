class Solution {
    public boolean equalFrequency(String word) {
        int len = word.length();
        int letters[] = new int[26];
        for (int i = 0; i < len; i++) {
            char letter = word.charAt(i);
            letters[letter - 'a']++;
        }
        
        for (int i = 0; i < len; i++) {
            char letter = word.charAt(i);
            letters[letter - 'a']--;
            if (fEqual(letters)) {
                return true;
            }
            letters[letter - 'a']++;
        }
        return false;
    }
    
    boolean fEqual(int[] letters) {
        int num = 0;
        
        for (int i: letters) {
            if (i == 0) {
                continue;
            } else if (num != 0 && i != num) {
                return false;
            }
            num = i;
        }
        return true;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s.charAt(i))){
                letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
            } else {
                letters.put(s.charAt(i), 1);
            }
        }
        
        int length = 0;
        int elements = letters.size();
        
        for (Character i : letters.keySet()) {
            int freq = letters.get(i);
            if (freq > 1) {
                length += (freq / 2) * 2;
                freq -= (freq / 2) * 2;
                if (freq == 0) {
                    elements--;
                }
            }
            
        }
        
        if (elements > 0) {
            return length + 1;
        }
        return length;
        
    }
}
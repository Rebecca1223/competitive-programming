class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> word = new HashMap<Character, Integer>();
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (word.containsKey(s.charAt(i))) {
                word.put(s.charAt(i), word.get(s.charAt(i)) + 1);
            } else {
                word.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (word.containsKey(t.charAt(i))) {
                if (word.get(t.charAt(i)) == 1) {
                    word.remove(t.charAt(i));
                } else {
                    word.put(t.charAt(i), word.get(t.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }
        
        return true;
    }
}
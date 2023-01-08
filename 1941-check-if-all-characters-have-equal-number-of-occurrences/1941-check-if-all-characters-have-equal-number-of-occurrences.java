class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            } else {
                freq.put(s.charAt(i), 1);
            }
        }
        
        int bench = freq.get(s.charAt(0));
        for (Integer i : freq.values()) {
            if (bench != i) return false;
        }
        return true;
    }
}
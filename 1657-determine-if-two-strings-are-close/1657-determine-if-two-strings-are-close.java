import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        HashMap<Character, Integer> w1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> w2 = new HashMap<Character, Integer>();
        HashSet<Character> seen = new HashSet<Character>();
        ArrayList<Integer> wo1 = new ArrayList<Integer>();
        ArrayList<Integer> wo2 = new ArrayList<Integer>();
        
        for (int i = 0; i < word1.length(); i++) {
            if (w1.containsKey(word1.charAt(i))) {
                w1.put(word1.charAt(i), w1.get(word1.charAt(i)) + 1);
            } else {
                w1.put(word1.charAt(i), 1);
            }
            
            if (w2.containsKey(word2.charAt(i))) {
                w2.put(word2.charAt(i), w2.get(word2.charAt(i)) + 1);
            } else {
                w2.put(word2.charAt(i), 1);
            }
            seen.add(word1.charAt(i));
        }
        
        for (int i = 0; i < word2.length(); i++) {
            if (!seen.contains(word2.charAt(i))) return false;
        }
        
        if (w1.size() != w2.size()) return false;
        
        for (int i : w1.values()) {
          wo1.add(i);
        }
        
        for (int i : w2.values()) {
          wo2.add(i);
        }
        
        Collections.sort(wo1);
        Collections.sort(wo2);
        
        for (int i = 0; i < wo1.size(); i++) {
            if (!wo1.get(i).equals(wo2.get(i))) return false;
        }
        
        return true;
    }
}
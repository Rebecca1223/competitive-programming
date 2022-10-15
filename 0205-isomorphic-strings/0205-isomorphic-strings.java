class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        HashSet<Character> has = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            
            if (has.contains(t.charAt(i)) && s.charAt(i) != map2.get(t.charAt(i))){
                return false;
            }
            
            map.put(s.charAt(i), t.charAt(i));
            map2.put(t.charAt(i), s.charAt(i));
            has.add(t.charAt(i));
        }
        return true;
    }
}
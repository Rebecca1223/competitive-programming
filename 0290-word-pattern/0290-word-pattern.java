class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" "); 
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashMap<String, Character> seen = new HashMap<String, Character>();
        
        if (pattern.length() != str.length) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i)) && !((map.get(pattern.charAt(i)))).equals(str[i])) {
                return false;
            } else if (seen.containsKey(str[i]) && (seen.get(str[i])) != pattern.charAt(i)) {
                return false;
            } else {
                map.put(pattern.charAt(i), str[i]);
                seen.put(str[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
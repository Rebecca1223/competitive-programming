class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (seen.contains(s.charAt(i))) return s.charAt(i);
            seen.add(s.charAt(i));
        }
        return 0;
    }
}
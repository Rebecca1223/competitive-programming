class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> seen = new HashSet<Character>();
        int max = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && seen.contains((char)(s.charAt(i) + 32))) { //if uppercase
                if (s.charAt(i) > max) max = s.charAt(i);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && seen.contains((char)(s.charAt(i) - 32))) { //if lower
                if (s.charAt(i) - 32 > max) max = s.charAt(i) - 32;
            } else {
                seen.add(s.charAt(i));
            }
        }
        if (max == ' ') return "";
        return Character.toString((char) max);
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> sstack = new ArrayList<>();
        ArrayList<Character> tstack = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (sstack.size() != 0) {
                    sstack.remove(sstack.size() - 1);
                }
            } else {
                sstack.add(s.charAt(i));
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (tstack.size() != 0) {
                    tstack.remove(tstack.size() - 1);
                }
            } else {
                tstack.add(t.charAt(i));
            }
        }
        
        if (sstack.size() != tstack.size()) {
            return false;
        } else {
            for (int i = 0; i < sstack.size(); i++) {
                if (sstack.get(i) != tstack.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
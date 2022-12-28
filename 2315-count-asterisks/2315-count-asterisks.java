class Solution {
    public int countAsterisks(String s) {
        int ass = 0;
        boolean bar = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && bar == false) {
                ass++;
            }
            if (s.charAt(i) == '|' && bar == false) {
                bar = true;
            } else if (s.charAt(i) == '|' && bar == true) {
                bar = false;
            }
        }
        return ass;
    }
}
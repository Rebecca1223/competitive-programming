class Solution {
    public String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        int len = part.length();
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + len);
            index = s.indexOf(part);
        }
        return s;
    }
}
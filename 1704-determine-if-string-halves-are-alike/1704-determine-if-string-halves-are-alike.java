class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> vowels = new HashSet<Character>();
        
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        int half = s.length() / 2;
        int one = 0, two = 0;
        
        for (int i = 0; i < half; i++) {
            if (vowels.contains(s.charAt(i))) one++;
        }
        
        for (int i = half; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) two++;
        }
        
        return one == two;
    }
}
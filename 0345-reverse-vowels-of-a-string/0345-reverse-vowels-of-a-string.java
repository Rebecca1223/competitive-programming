import java.util.*;

class Solution {
    public String reverseVowels(String s) {
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
        
        int start = 0;
        int end = s.length()-1;
        char temp;
        StringBuilder str = new StringBuilder(s);
        
        while (start < end) {
            while (!vowels.contains(s.charAt(start))) {
                if (start >= s.length() - 1){
                    break;
                } else {
                   start++; 
                }
            }
            while (!vowels.contains(s.charAt(end))) {
                if (end <= 0) {
                    break;
                } else {
                   end--; 
                }
            }
            
            if (vowels.contains(s.charAt(start)) && vowels.contains(s.charAt(end))) {
                temp = s.charAt(start);
                str.setCharAt(start, s.charAt(end));
                str.setCharAt(end, temp);
                
                start++;
                end--;
            }
        }
        
        return str.toString();
    }
}
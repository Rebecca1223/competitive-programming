class Solution {
    public String reverseVowels(String s) {
        String modify = s;
        int start = 0;
        int end = s.length()-1;
        char temp;
        
        while (start < end) {
            while (vowel(s.charAt(start)) == false) {
                if (start >= s.length() - 1){
                    break;
                } else {
                   start++; 
                }
            }
            while (vowel(s.charAt(end)) == false) {
                if (end <= 0) {
                    break;
                } else {
                   end--; 
                }
            }
            
            if (vowel(s.charAt(start)) == true && vowel(s.charAt(end)) == true) {
                temp = s.charAt(start);
                modify = modify.substring(0, start) + s.charAt(end) + modify.substring(start + 1);
                modify = modify.substring(0, end) + temp + modify.substring(end + 1);
                
                start++;
                end--;
            }
        }
        
        return modify;
    }
    
    boolean vowel(char check) {
        if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' || check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U') return true;
        return false;
    }
}
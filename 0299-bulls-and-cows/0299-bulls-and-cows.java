class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        char[] guesses = guess.toCharArray();
        
        for (int i = 0; i < secret.length(); i++) {
            if (sMap.containsKey(secret.charAt(i))) {
                sMap.put(secret.charAt(i), sMap.get(secret.charAt(i)) + 1);
            } else {
                sMap.put(secret.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guesses[i]) {
                bulls++;
                if(sMap.get(guesses[i]) - 1 == 0) {
                    sMap.remove(guesses[i]);
                } else {
                    sMap.put(guesses[i], sMap.get(guesses[i]) - 1);
                }
                guesses[i] = 'x';
            }
        }
        
        for (int i = 0; i < guess.length(); i++) {
            if (sMap.containsKey(guesses[i])) {
                if (secret.charAt(i) == guesses[i]) {
                    bulls++;
                } else {
                    cows++;
                }
                
                if(sMap.get(guesses[i]) - 1 == 0) {
                    sMap.remove(guesses[i]);
                } else {
                    sMap.put(guesses[i], sMap.get(guesses[i]) - 1);
                }
            }
        }
        
        return bulls+"A"+cows+"B";
    }
}
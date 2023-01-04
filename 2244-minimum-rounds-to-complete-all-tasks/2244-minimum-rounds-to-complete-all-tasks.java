class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < tasks.length; i++) {
            if (!freq.containsKey(tasks[i])) {
                freq.put(tasks[i], 1);
            } else {
                freq.put(tasks[i], freq.get(tasks[i]) + 1);
            }
        }
        
        int rounds = 0;
        
        for (Integer i : freq.values()) {
            if (i == 1) return -1;
            rounds += (i/6) * 2;
            int r = i % 6;
            if (r == 1 || r == 2 || r == 3) rounds++;
            if (r == 4 || r == 5) rounds += 2;
        }
        
        return rounds;
    }
}
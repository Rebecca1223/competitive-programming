class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> none = new ArrayList<Integer>();
        List<Integer> one = new ArrayList<Integer>();
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        HashSet<Integer> players = new HashSet<Integer>();
        HashMap<Integer, Integer> scores = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < matches.length; i++) {
            if (scores.containsKey(matches[i][1])) {
                scores.put(matches[i][1], scores.get(matches[i][1]) - 1);
            } else {
                scores.put(matches[i][1], -1);
            }
            players.add(matches[i][0]);
            players.add(matches[i][1]);
        }
        
        for (Integer i : players) {
            if (!scores.containsKey(i)) {
                none.add(i);
            } else if (scores.get(i) == 0) {
                none.add(i);
            } else if (scores.get(i) == -1) {
                one.add(i);
            }
        }
        Collections.sort(none);
        Collections.sort(one);
        answer.add(none);
        answer.add(one);
        return answer;
    }
}
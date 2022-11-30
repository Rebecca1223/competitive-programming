class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> seen = new HashSet<Integer>();
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }
        
        for (int i : freq.values()) {
            if (seen.contains(i)) return false;
            seen.add(i);
        }
        return true;
    }
}
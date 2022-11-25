class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        
        for (int i = 0; i < timeSeries.length-1; i++) {
            if (timeSeries[i+1] - timeSeries[i] < duration) {
                total += timeSeries[i+1] - timeSeries[i];
            } else {
                total += duration;
            }
        }
        
        total += duration;
        return total;
    }
}
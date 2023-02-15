class Solution {
    public long pickGifts(int[] gifts, int k) {
        long take = 0;
        
        for (int i = 0; i < k; i++) {
            int max = gifts[0];
            int maxIndex = 0;
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j] > max) {
                    maxIndex = j;
                    max = gifts[j];
                }
            }
            int temp = (int)Math.floor(Math.sqrt(max));
            gifts[maxIndex] = temp;
        }
        
        for (int i = 0; i < gifts.length; i++) {
            take += gifts[i];
        }
        
        return take;
    }
}
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            int len = 0, sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                if (sum > queries[i]) break;
                len++;
            }
            answer[i] = len;
        }
        
        return answer;
    }
}
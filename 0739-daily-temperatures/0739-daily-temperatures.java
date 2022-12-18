class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> mono = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
          while (!mono.isEmpty() && temperatures[mono.peek()] < temperatures[i]) {
            int index = mono.pop();
            answer[index] = i - index;
          }
          mono.push(i);
        }

        return answer;
    }
}
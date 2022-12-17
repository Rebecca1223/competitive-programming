import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        
        Stack<Integer> nums = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            int temp1 = 0, temp2 = 0;
            if (tokens[i].equals("+")) {
                temp2 = nums.pop();
                temp1 = nums.pop();
                nums.push(temp1 + temp2);
            } else if (tokens[i].equals("-")) {
                temp2 = nums.pop();
                temp1 = nums.pop();
                nums.push(temp1 - temp2);
            } else if (tokens[i].equals("*")) {
                temp2 = nums.pop();
                temp1 = nums.pop();
                nums.push(temp1 * temp2);
            } else if (tokens[i].equals("/")) {
                temp2 = nums.pop();
                temp1 = nums.pop();
                nums.push(temp1 / temp2);
            } else {
                nums.push(Integer.parseInt(tokens[i]));
            }
        }
        
        return nums.peek();
    }
}

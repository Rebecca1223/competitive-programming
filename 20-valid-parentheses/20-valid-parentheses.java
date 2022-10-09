class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(brackets.containsKey(current)){
                stack.push(current);
                continue;
            }
            if(stack.isEmpty() || brackets.get(stack.pop()) != current) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
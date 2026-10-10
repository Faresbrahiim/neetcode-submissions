class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Opening brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Closing bracket with no opening bracket
            else if (stack.isEmpty()) {
                return false;
            }
            // Check matching brackets
            else if (c == ')' && stack.pop() != '(') {
                return false;
            }
            else if (c == ']' && stack.pop() != '[') {
                return false;
            }
            else if (c == '}' && stack.pop() != '{') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        // Stack stores pairs: [character, count of consecutive characters]
        Stack<int[]> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                // Same character as top of stack
                stack.peek()[1]++;
                
                // If count reaches k, remove all k characters
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } else {
                // Different character, push new pair
                stack.push(new int[]{c, 1});
            }
        }
        
        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (int[] pair : stack) {
            char c = (char) pair[0];
            int count = pair[1];
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
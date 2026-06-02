class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> d = new ArrayDeque<>();
        int a = 0;
        int b = 0;
        for(String s : tokens){
            switch(s){
                case "+":
                d.push(d.pop() + d.pop());
                break;
                case "-":       
                a = d.pop();
                b = d.pop();
                d.push(b - a);
                break;
                case "/":
                a = d.pop();
                b = d.pop();
                d.push(b / a);
                break;
                case "*":
                d.push(d.pop() * d.pop());
                break;
                default:
                d.push(Integer.parseInt(s));
                break;
            }
        }
        return d.peek();
    }
}
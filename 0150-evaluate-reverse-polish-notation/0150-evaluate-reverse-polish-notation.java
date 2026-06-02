class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> d = new ArrayDeque<>();
        for(String s : tokens){
            switch(s){
                case "+":
                d.push(Integer.parseInt(d.pop()) + Integer.parseInt(d.pop())+"");
                break;
                case "-":       
                int a  = Integer.parseInt(d.pop());
                int b  = Integer.parseInt(d.pop());
                d.push((b-a) + "");
                break;
                case "/":
                int c  = Integer.parseInt(d.pop());
                int f  = Integer.parseInt(d.pop());
                d.push((f /c) + "");
                break;
                case "*":
                d.push(Integer.parseInt(d.pop()) * Integer.parseInt(d.pop())+"");
                break;
                default:
                d.push(s);
                break;
            }
        }
        return (int)Integer.parseInt(d.peek());
    }
}
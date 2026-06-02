class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> d = new ArrayDeque<>();
        int a =0;
        int b =0;
        for(String s : tokens){
            switch(s){
                case "+":
                d.push(Integer.parseInt(d.pop()) + Integer.parseInt(d.pop())+"");
                break;
                case "-":       
                a  = Integer.parseInt(d.pop());
                b  = Integer.parseInt(d.pop());
                d.push((b-a) + "");
                break;
                case "/":
                a= Integer.parseInt(d.pop());
                b  = Integer.parseInt(d.pop());
                d.push((b /a) + "");
                break;
                case "*":
                d.push(Integer.parseInt(d.pop()) * Integer.parseInt(d.pop())+"");
                break;
                default:
                d.push(s);
                break;
            }
        }
        return Integer.parseInt(d.peek());
    }
}
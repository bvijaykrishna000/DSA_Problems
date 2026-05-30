class MyQueue {
    Stack<Integer> p = new Stack<>();
    Stack<Integer> s = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(p.isEmpty()){
            p.push(x);
        }
        else{
            while(!(p.isEmpty())){
                s.push(p.pop());
            }
            p.push(x);
            while(!(s.isEmpty())){
                p.push(s.pop());
            }
        }
    }
    
    public int pop() {
        return p.pop();
    }
    
    public int peek() {
        return p.peek();
    }
    
    public boolean empty() {
        if(p.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
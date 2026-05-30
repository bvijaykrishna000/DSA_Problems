class MyStack {
        Queue<Integer> p = new ArrayDeque<>();
        Queue<Integer> s = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(p.isEmpty()){
            p.offer(x);
        }
        else{
            while(!(p.isEmpty())){
                s.offer(p.poll());
            }
            p.offer(x);
            while(!(s.isEmpty())){
                p.offer(s.poll());
            }
        }
    }
    
    public int pop() {
        return p.poll();
    }
    
    public int top() {
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
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
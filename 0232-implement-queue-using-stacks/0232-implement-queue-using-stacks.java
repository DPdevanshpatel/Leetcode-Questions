class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
        return;
    }
    
    public int pop() {
        int ele = st1.size();
        for(int i=0; i<ele; i++){
            st2.push(st1.pop());
        }
        int x = st2.peek();
        st2.pop();
        ele=st2.size();
        for(int i=0; i<ele; i++){
            st1.push(st2.pop());
        }
        return x;
    }
    
    public int peek() {
        int ele=st1.size();
        for(int i=0; i<ele; i++){
            st2.push(st1.pop());
        }
        int x = st2.peek();

        ele=st2.size();
        for(int i=0; i<ele;i++){
            st1.push(st2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        if(st1.isEmpty()) return true;
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
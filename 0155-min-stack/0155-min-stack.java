class MinStack {

    ArrayList<Integer> arr;
    ArrayList<Integer> min;
    public MinStack() {
        arr= new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int value) {
        arr.add(value);
        if(min.isEmpty()){
            min.add(value);
        }else{
            min.add(Math.min(value,min.get(min.size()-1)));
        }
    }
    
    public void pop() {
        arr.remove(arr.size()-1);
        min.remove(min.size()-1);
    }
    
    public int top() {
        if(arr.size()==0) return -1;
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        
        return min.get(min.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
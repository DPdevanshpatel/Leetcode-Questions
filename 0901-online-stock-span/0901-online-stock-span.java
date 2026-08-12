class StockSpanner {

    Stack<Integer> st;
    Stack<Integer> idx;
    int count=0;
    public StockSpanner() {
        st = new Stack<>();
        idx = new Stack<>();
        count=0;
    }
    
    public int next(int price) {
        
        int ans=0;
        while(!st.isEmpty() && st.peek()<=price){
            st.pop();
            idx.pop();
        }
        if(st.isEmpty()){
            ans=count+1;
        }else{
            ans = count-idx.peek();
        }
        st.push(price);
        idx.push(count);
        count++;

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
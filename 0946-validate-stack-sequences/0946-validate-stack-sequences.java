class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st = new Stack<>();
        int k=0;
        for(int i=0; i<pushed.length; i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek()==popped[k]){
                st.pop();
                k++;
            }
        }

        while(!st.isEmpty()){
            if(st.peek()!=popped[k]){
                return false; 
            }
            st.pop();
            k++;
        }
        return true;
    }
}
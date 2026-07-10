class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int arr[]=new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1; i>=0; i--)
        {
            while(!st.empty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.empty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek()-i;
            }
            st.push(i);
        }
        return arr;
    }
}
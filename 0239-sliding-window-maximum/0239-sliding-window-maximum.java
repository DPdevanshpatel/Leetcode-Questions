class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int z=0;
        int[] ans = new int[n-k+1];
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i]=n;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
        }

        int j=0;
        for(int i=0; i<n-k+1; i++){
            if(j>=i+k) j=i;
            int max=nums[i];
            while(j<i+k){
                max=nums[j];
                j=nge[j];
            }
            ans[z++]=max;
        }
        return ans;
    }
}
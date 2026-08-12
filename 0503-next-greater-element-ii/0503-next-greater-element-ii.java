class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        st.push(nums[nums.length-1]);

        int[] arr = new int[nums.length];
        int max=nums[0];
        for(int i=0; i<nums.length; i++)
        {
            if(max<nums[i]){
                max=nums[i];
            }
            if(max==nums[nums.length-1]){
                max=-1;
            }
        }
        arr[nums.length-1]=max;

        for(int i=2*nums.length-2; i>=0; i--){
            int curr =nums[i%nums.length];
            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            if(i<nums.length){
                if(st.isEmpty()){
                    arr[i]=-1;
                }else{
                    arr[i]=st.peek();
                }
            }
            st.push(curr);
        }
        return arr;

    }
}
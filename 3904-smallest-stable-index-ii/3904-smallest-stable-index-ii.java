class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] mini =new int[nums.length];
        mini[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2; i>=0; i--){
            mini[i] = Math.min(nums[i],mini[i+1]);
        }

        int maxleft=0;
        for(int i=0; i<nums.length; i++){
            maxleft=Math.max(maxleft,nums[i]);
            int instablity=maxleft-mini[i];
            if(instablity<=k){
                return i;
            }
        }
        return -1;
    }
}
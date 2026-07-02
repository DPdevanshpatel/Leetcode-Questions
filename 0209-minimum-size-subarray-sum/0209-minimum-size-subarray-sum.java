class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right =0;
        int left=0;
        int count=Integer.MAX_VALUE;
        int sum=0;

        while(right<nums.length)
        {
            sum+=nums[right];
            while(sum>=target){
                count=Math.min(count, right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        if(count==Integer.MAX_VALUE) return 0;
        return count;
    }
}
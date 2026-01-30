class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {

        int n=nums.size();
        int totalsum=0;
        for(int i=0; i<n; i++)
        {
            totalsum+=nums[i];
        }

        int minsum= nums[0];
        int currmin = nums[0];
        int currsum=nums[0];
        int maxsum=nums[0];

        for(int i=1; i<n; i++)
        {
            currsum=max(nums[i],currsum+nums[i]);
            maxsum=max(currsum,maxsum);
            currmin = min(currmin+nums[i],nums[i]);
            minsum=min(currmin,minsum);
        }

        if(maxsum<0){
            return maxsum;
        }
        return max(maxsum,totalsum-minsum);

    }
};
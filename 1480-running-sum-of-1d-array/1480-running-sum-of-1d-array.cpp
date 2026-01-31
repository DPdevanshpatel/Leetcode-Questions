class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        
        int n=nums.size();
        vector<int> m;
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum=sum+nums[i];
            m.push_back(sum);
        }
        return m;

    }
};
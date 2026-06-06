class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int n =nums.size();
        vector<int> v1;
        v1.push_back(0);
        vector<int> v2(n,0);
        vector<int> v3;
        int sum=0;
        for(int i=0; i<n-1; i++)
        {
            sum+=nums[i];
            v1.push_back(sum);
        }
        
        sum=0;
        for(int i=n-1; i>0; i--)
        {
            sum+=nums[i];
            v2[i-1]=sum;
        }

        for(int i=0; i<n; i++)
        {
            int k = abs(v1[i]-v2[i]);
            v3.push_back(k);
        }

        return v3;
    }
};
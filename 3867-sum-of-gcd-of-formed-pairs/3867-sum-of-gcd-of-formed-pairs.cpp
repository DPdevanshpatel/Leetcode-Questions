class Solution {
public:
    int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    long long gcdSum(vector<int>& nums) 
    {
        vector<int> v;
        int maxelement=nums[0];
        for(int i=0; i<nums.size(); i++)
        {
            maxelement = max(maxelement,nums[i]);
            v.push_back(gcd(maxelement,nums[i]));
        }

        sort(v.begin(),v.end());

        int left=0;
        int right=nums.size()-1;

        long long ans = 0;
        while(left<right){
            ans+=gcd(v[left],v[right]);
            right--;
            left++;
        }
        return ans;
    }
};
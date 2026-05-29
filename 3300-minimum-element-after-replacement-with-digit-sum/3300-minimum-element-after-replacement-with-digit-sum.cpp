class Solution {
public:
    int minElement(vector<int>& nums) {
        int a = INT_MAX;
        for(int i=0; i<nums.size(); i++)
        {
            int sum=0;
            while(nums[i]>0){
                int m = nums[i]%10;
                sum+=m;
                nums[i]=nums[i]/10;
            }
            if(sum<a){
                a=sum;
            }
            sum=0;
        }

        return a;
    }
};
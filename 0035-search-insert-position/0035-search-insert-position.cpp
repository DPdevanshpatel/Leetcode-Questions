class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        // int m=0;
        int count=0;
        for(int i=0; i<nums.size(); i++)
        {
            if(target>nums[i]){
                count++;
            }
        }
        return count;
    }
};
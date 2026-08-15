class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
        
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
        }
        if(sum%3!=0) return false;
        
        int val = sum/3;
        int s=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            s+=nums[i];
            if(s==val){
                count++;
                s=0;
            }
        }
        return count>=3;
    }
}
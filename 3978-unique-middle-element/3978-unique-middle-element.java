class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1) return true;
        int mid = nums.length/2;
        int val = nums[mid];
        
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(val==nums[i]){
                count++;
            }
        }
        return (count<2)? true:false;
    }
}
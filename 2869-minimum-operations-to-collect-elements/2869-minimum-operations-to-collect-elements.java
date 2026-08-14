class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        int operations=0;
        for(int i=nums.size()-1;i>=0; i--){
            if(nums.get(i)<=k){
                set.add(nums.get(i));
            }
            operations++;

            if(set.size()==k){
                return operations;
            }
        }
        return nums.size();
    }
}
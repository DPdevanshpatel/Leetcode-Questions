class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int m = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        int j = (nums[0]-1)*(nums[1]-1);

        return Math.max(m,j);
    }
}
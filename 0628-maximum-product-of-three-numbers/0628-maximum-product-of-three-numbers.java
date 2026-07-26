class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int k = nums[n-1]*nums[n-2]*nums[n-3];
        int m = nums[n-1]*nums[n-2]*nums[0];
        int j = nums[n-1]*nums[1]*nums[0];

        return Math.max(k,Math.max(m,j));
    }
}
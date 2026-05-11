class Solution {
public:
    string triangleType(vector<int>& nums) {

        sort(nums.begin(), nums.end());

        int a = nums[0], b = nums[1], c = nums[2];

        // check validity
        if(a + b <= c) {
            return "none";
        }

        // all equal
        if(a == b && b == c) {
            return "equilateral";
        }

        // two equal
        if(a == b || b == c || a == c) {
            return "isosceles";
        }

        // all different
        return "scalene";
    }
};
class Solution {
    public int gcd(int a, int b)
    {
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];

        for(int i=0; i<nums.length; i++)
        {
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
        }

        return gcd(max,min);
    }
}
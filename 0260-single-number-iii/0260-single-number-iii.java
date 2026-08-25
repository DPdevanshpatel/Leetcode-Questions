class Solution {
    public int[] singleNumber(int[] nums) {
        int xor =0;
        for(int num: nums){
            xor^=num;
        }

        int mask = xor & -xor;

        int res =0;
        int res2=0;
        for(int num: nums){
            if((num&mask)==0){
                res^=num;
            }else{
                res2^=num;
            }
        }

        return new int[] {res,res2};

    }
}
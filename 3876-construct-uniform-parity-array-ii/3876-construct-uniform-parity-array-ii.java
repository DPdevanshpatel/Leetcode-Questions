class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        int mineven=Integer.MAX_VALUE;

        for(int x: nums1){
            if((x&1)==0) mineven=Math.min(mineven,x);
            else minodd=Math.min(minodd,x);
        }

        if(minodd==Integer.MAX_VALUE) return true;

        return minodd<mineven;
    }
}
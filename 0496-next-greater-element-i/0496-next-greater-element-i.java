class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            res[i]=find(nums2,nums1[i]);
        }
        return res;
    }

    public int find(int[]nums2, int num){
        int idx=-1;
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]==num){
                idx=i;
                break;
            }
        }

        for(int i=idx; i<nums2.length; i++){
            if(nums2[i]>num){
                return nums2[i];
            }
        }
        return -1;
    }
}
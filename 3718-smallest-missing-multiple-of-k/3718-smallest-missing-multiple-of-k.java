class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        for(int i=1; ;i++){
            int multi = i*k;

            if(!set.contains(multi)){
                return multi;
            }
        }
    }
}
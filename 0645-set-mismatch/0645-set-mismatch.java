class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        int sum=0;
        for(int num : nums){
            if(set.contains(num)){
                arr[0]=num;
            }else{
                set.add(num);
                sum+=num;
            }
        }

        // int sum=0;
        // for(int num:set){
        //     sum+=num;
        // }

        int sum2=0;
        for(int i=1; i<=nums.length; i++){
            sum2+=i;
        }

        arr[1]=sum2-sum;

        return arr;
    }
}
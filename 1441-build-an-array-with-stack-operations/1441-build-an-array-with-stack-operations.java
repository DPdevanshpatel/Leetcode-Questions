class Solution {
    public List<String> buildArray(int[] target, int n) {
        int[] arr = new int[n];
        ArrayList<String> res = new ArrayList<>();

        int j=0;
        for(int i=0; i<n; i++){

            arr[i]=i+1;
            if(j==target.length) break;
            if(arr[i]==target[j]){
                res.add("Push");
                j++;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }

            if(arr==target){
                return res;
            }
        }
        return res;
    }
}
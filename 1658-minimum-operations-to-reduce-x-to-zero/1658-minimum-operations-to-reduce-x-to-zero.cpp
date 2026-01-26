class Solution {
public:
    int minOperations(vector<int>& arr, int x) {
        
        int n=arr.size();
        int sum1=0;
        for(int i=0; i<n; i++)
        {
            sum1+=arr[i];
        }

        int left=0;
        int sum=sum1-x;
        int len=-1;
        int currsum=0;
        for(int right=0; right<n; right++)
        {
            currsum+=arr[right];
            while(currsum>sum && left<=right)
            {
                currsum-=arr[left];
                left++;
            }
            if(currsum==sum){
                len=max(len,right-left+1);
            }
        }
        if(len==-1){
            return -1;
        }
        else{
            return n-len;
        }
    }
};
class Solution {
public:
    int subtractProductAndSum(int n) {
        int k=n;
        int sum=0;
        int pro =1;
        while(k!=0)
        {
            int digit = k%10;
            sum+=digit;
            pro=pro*digit;
            k/=10;
        }

        return pro-sum;
    }
};
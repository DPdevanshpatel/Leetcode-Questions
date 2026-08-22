class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int multi=1;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            multi*=digit;
            temp/=10;
        }

        return n%(sum+multi)==0;


    }
}
class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int t = b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int j=1;
        int k=2;
        int sumeven=0;
        for(int i=0; i<n; i++){
            sumodd+=j;
            j+=2;
        }
        for(int i=0; i<n; i++){
            sumeven+=k;
            k+=2;
        }

        int l=gcd(sumodd,sumeven);
        return l;
    }
}
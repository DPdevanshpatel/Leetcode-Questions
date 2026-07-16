class Solution {
public:
    vector<int> minCosts(vector<int>& cost)
    {
        vector<int> v;
        int minelement = cost[0];
        for(int i=0; i<cost.size(); i++)
        {
            minelement = min(minelement,cost[i]);
            v.push_back(minelement);
        }     
        return v;   
    }
};
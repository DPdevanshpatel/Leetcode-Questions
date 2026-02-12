#include <bits/stdc++.h>
class Solution {
public:
    bool makeEqual(vector<string>& words) {
        
        unordered_map<char,int> ump;

        for(auto a: words){
            for(auto element: a){
                ump[element]++;
            }
        }

        int n= words.size();

        for(auto j: ump){
            if(j.second%n!=0){
                return false;
            }
        }
        return true;
    }
};
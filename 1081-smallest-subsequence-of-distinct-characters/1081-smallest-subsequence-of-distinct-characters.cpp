class Solution {
public:
    string smallestSubsequence(string s) {
        if (s.empty()) return "";

        vector<int> cnt(26, 0);
        for (char c:s)
            cnt[c-'a']++;

        int pos = 0;

        for (int i=0; i<s.size(); i++) {
            if (s[i] < s[pos])
                pos=i;

            cnt[s[i]-'a']--;

            if(cnt[s[i]-'a']==0)
                break;
        }

        string rem ="";
        for (int i=pos+1; i<s.size(); i++)
            if (s[i]!=s[pos])
                rem+=s[i];

        return s[pos] + smallestSubsequence(rem);
    }
};
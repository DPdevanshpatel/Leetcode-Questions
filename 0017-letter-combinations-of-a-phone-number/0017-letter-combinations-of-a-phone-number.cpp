class Solution {
public:
    
    vector<string> mp = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    vector<string> ans;

    void solve(string digits, int idx, string temp) {

        if (idx == digits.size()) {
            ans.push_back(temp);
            return;
        }

        string s = mp[digits[idx] - '0'];

        for (char ch : s) {
            solve(digits, idx + 1, temp + ch);
        }
    }

    vector<string> letterCombinations(string digits) {

        if (digits.empty())
            return {};

        solve(digits, 0, "");

        return ans;
    }
};

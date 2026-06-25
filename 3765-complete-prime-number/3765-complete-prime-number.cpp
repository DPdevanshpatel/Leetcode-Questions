class Solution {
public:
    bool isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; 1LL * i * i <= n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    bool completePrime(int num) {
        string s = to_string(num);
        int n = s.size();

        // Check prefixes
        int x = 0;
        for (char c : s) {
            x = x * 10 + (c - '0');
            if (!isPrime(x)) return false;
        }

        // Check suffixes
        x = 0;
        int p = 1;
        for (int i = n - 1; i >= 0; --i) {
            x = p * (s[i] - '0') + x;
            p *= 10;
            if (!isPrime(x)) return false;
        }

        return true;
    }
};
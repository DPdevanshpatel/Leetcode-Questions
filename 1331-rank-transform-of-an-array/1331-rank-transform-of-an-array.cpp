class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {

        vector<int> temp = arr;
        sort(temp.begin(), temp.end());

        unordered_map<int, int> rank;
        int r = 1;

        // Assign ranks
        for (int i = 0; i < temp.size(); i++) {

            if (rank.find(temp[i]) == rank.end()) {
                rank[temp[i]] = r;
                r++;
            }
        }

        // Replace with ranks
        for (int i = 0; i < arr.size(); i++) {
            arr[i] = rank[arr[i]];
        }

        return arr;
    }
};
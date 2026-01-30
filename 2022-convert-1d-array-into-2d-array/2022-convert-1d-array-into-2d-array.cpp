// class Solution {
// public:
//     vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {


//         vector<vector<int>> mat(m,vector<int>(n));

//         if(m*n==original.size()){
//             // int row=original.size()/m;

//             int index=0;
//             for(int i=0; i<m; i++)
//             {
//                 for(int j=0; j<n; j++)
//                 {
//                     mat[i][j]=original[index];
//                     index++;
//                 }
//             }
//         }
//         else{
//             return {};
//         }
//         return mat;
//     }
// };

// class Solution {
// public:
//     vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {


//         vector<vector<int>> mat(m,vector<int>(n));

//         if(m*n==original.size()){
//             // int row=original.size()/m;

//             int index=0;
//             int l=0;
//             for(int i=0; i<m; i++)
//             {
//                 l=0;
//                 while(l!=n){
//                     mat[i][l]=original[index];
//                     index++;
//                     l++;
//                 }
//             }
//         }
//         else{
//             return {};
//         }
//         return mat;
//     }
// };

class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n){
       
        vector<vector<int>> mat(m,vector<int>(n));

        if(m*n!=original.size()) return {};
        for(int index=0; index<original.size(); index++)
        {
            int row = index/n;
            int column = index%n;
            mat[row][column] = original[index];
        }
        return mat;
    }
};
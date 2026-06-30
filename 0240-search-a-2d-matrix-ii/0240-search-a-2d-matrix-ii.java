class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right=matrix[0].length-1;

        while(right>=0 && left<matrix.length)
        {
            if(matrix[left][right]==target){
                return true;
            }
            else if(matrix[left][right]<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
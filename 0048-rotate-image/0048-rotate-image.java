class Solution {
    public void rotate(int[][] matrix) {

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i+1; j<matrix.length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int right=matrix.length-1;
        int left=0;
        while(left<=right){
            for(int i=0; i<matrix.length; i++)
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
            }
            left++;
            right--;
        }

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0;j<matrix.length; j++)
            {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
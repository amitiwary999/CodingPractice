/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
*/

class Solution {
    public int uniquePaths(int col, int row) {
        if(col==0||row==0){
            return 0;
        }
        int[][] temp = new int[row][col];
        for(int i=0;i<row;i++){
            temp[i][0]=1;
        }
        for(int j=1;j<col;j++){
            temp[0][j]=1;
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                temp[i][j]=temp[i-1][j]+temp[i][j-1];
            }
        }
        return temp[row-1][col-1];
    }
}

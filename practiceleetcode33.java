/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
*/

class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if(row>0){
        int col=grid[0].length;
            if(col>0){
        int[][] temp = new int[row][col];
        temp[0][0]=grid[0][0];
        for(int i=1;i<col;i++){
            temp[0][i]=temp[0][i-1]+grid[0][i];
        }
        
        for(int i=1;i<row;i++){
            temp[i][0]=temp[i-1][0]+grid[i][0];
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                int num = min(temp[i-1][j], temp[i][j-1]);
                temp[i][j]=num+grid[i][j];
            }
        }
         return temp[row-1][col-1];
        }
            return 0;
      }
        return 0;
    }
    
    public int min(int num1, int num2){
        return num1<num2?num1:num2;
    }
}

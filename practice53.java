/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time. 
*/

public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();
        int n=0;
        int min=Integer.MAX_VALUE;
        if(m>0){
           n = A.get(0).size();
           if(n>0){
           int[][] temp = new int[m+1][n+1];
           temp[0][0]=0;
           temp[0][1]=0;
           temp[1][0]=0;
           for(int i=2;i<=m;i++){
               temp[i][0] = Integer.MAX_VALUE;
           }
           
           for(int i=2;i<=n;i++){
               temp[0][i]=Integer.MAX_VALUE;
           }
           
           for(int i=1;i<=m;i++){
               for(int j=1;j<=n;j++){
                   int num = A.get(i-1).get(j-1);
                   int flag = temp[i][j-1]<temp[i-1][j]?temp[i][j-1]:temp[i-1][j];
                   temp[i][j] = num+flag;
               }
           }
           return temp[m][n];
           }
        }
        return 0;
        
    }
}

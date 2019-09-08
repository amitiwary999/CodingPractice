/*
Given a square array of integers A, we want the minimum sum of a falling path through A.

A falling path starts at any element in the first row, and chooses one element from each row.  The next row's choice must be in a column that is different from the previous row's column by at most one.
*/

class Solution {
    public int minFallingPathSum(int[][] A) {
        int size = A.length;
        int min=0;
        int[][] ans = new int[size+1][size+2];
        for(int i=0;i<size;i++){
            for(int j=0;j<=size+1;j++){
                ans[i][j]=1000;
            }
        }
        for(int i=0;i<=size+1;i++){
            ans[size][i]=0;
        }
        
        
        for(int i=size-1;i>=0;i--){
            for(int j=1;j<=size;j++){
                int flag = A[i][j-1]+(min(ans[i+1][j-1], ans[i+1][j], ans[i+1][j+1]));
                ans[i][j]=flag<ans[i][j]?flag:ans[i][j];
            }
        }
        min = ans[0][1];
        for(int i=2;i<=size;i++){
            min = min>ans[0][i]?ans[0][i]:min;
        }
        return min;
    }
    
    static int min(int num1, int num2, int num3){
        int min1 = num1>num2?num2:num1;
        return min1>num3?num3:min1;
    }
}

/*
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:

[
  [ 1, 2, 3 ],
  [ 8, 9, 4 ],
  [ 7, 6, 5 ]
]
*/

public class Solution {
    public int[][] generateMatrix(int A) {
        int size = A*A;
        int i = 1;
        int count = 0;
        int start = 0;
        int[][] ans = new int[A][A];
        while(i<=size){
            for(int j=start;j<(A-count);j++){
                if(i<=size){
                   ans[start][j] = i;
                   i++;
                }
            }
            
            for(int j=count+1;j<=(A-2-count);j++){
                if(i<=size){
                   ans[j][A-start-1] = i;
                   i++;
                }
            }
            
            for(int j=(A-count-1);j>=start;j--){
                if(i<=size){
                   ans[A-start-1][j] = i;
                   i++;
                }
            }
            
            for(int j=A-2-count;j>count;j--){
                if(i<=size){
                   ans[j][start]=i;
                   i++;
                }
            }
            start++;
            count++;
        }
        return ans;
    }
}

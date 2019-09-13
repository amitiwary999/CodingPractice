/*Given an array A of integers, return the length of the longest arithmetic subsequence in A.

Recall that a subsequence of A is a list A[i_1], A[i_2], ..., A[i_k] with 0 <= i_1 < i_2 < ... < i_k <= A.length - 1, and that a sequence B is arithmetic if B[i+1] - B[i] are all the same value (for 0 <= i < B.length - 1).*/

class Solution {
    public int longestArithSeqLength(int[] A) {
        int size = A.length;
        int max=0;
        int res=0;
        for(int i : A){
            max = max(i, max);
        }
         int[][] temp = new int[size][max+1];
        int[][] tempNeg = new int[size][max+1];
        for(int i=1;i<size;i++){
            for(int j=0;j<i;j++){
                int diff = A[i]-A[j];
                
                if(diff>0){
                temp[i][diff]=temp[j][diff]+1;
                res=max(res, temp[i][diff]);
                }else{
                    tempNeg[i][-diff]=tempNeg[j][-diff]+1;
                    res=max(res, tempNeg[i][-diff]);
                }
            }
        }
        return res+1;
    }
    
    static int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

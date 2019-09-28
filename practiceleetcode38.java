/*
Given an array A of non-negative integers, return the maximum sum of elements in two non-overlapping (contiguous) subarrays, which have lengths L and M.  (For clarification, the L-length subarray could occur before or after the M-length subarray.)

Formally, return the largest V for which V = (A[i] + A[i+1] + ... + A[i+L-1]) + (A[j] + A[j+1] + ... + A[j+M-1]) and either:

0 <= i < i + L - 1 < j < j + M - 1 < A.length, or
0 <= j < j + M - 1 < i < i + L - 1 < A.length.
*/

class Solution {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int length = A.length;
        int[] lSum = new int[length-L+1];
        int[] mSum = new int[length-M+1];
        int ans=0;
        
        for(int i=0;i<=length-L;i++){
            int num=0;
            for(int j=0;j<L;j++){
                num=num+A[i+j];
            }
            lSum[i]=num;
        }
        
        for(int i=0;i<=length-M;i++){
            int num=0;
            for(int j=0;j<M;j++){
                num=num+A[i+j];
            }
            mSum[i]=num;
        }
        
        for(int i=0;i<=length-L;i++){
            int lMax=0;
            int rMax=0;
            for(int j=0;j<=i-M;j++){
                lMax = max(lMax, mSum[j]);
            }
            
            for(int k=i+L;k<=length-M;k++){
                rMax = max(rMax, mSum[k]);
            }
            
            ans = max(ans, lSum[i]+max(lMax, rMax));
        }
        return ans;
    }
    
    public int max(int num1,int num2){
        return num1>num2?num1:num2;
    }
}

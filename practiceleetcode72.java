/*
Given an array A of positive integers (not necessarily distinct), return the lexicographically largest permutation that is smaller than A, that can be made with one swap (A swap exchanges the positions of two numbers A[i] and A[j]).  If it cannot be done, then return the same array.
*/

class Solution {
    public int[] prevPermOpt1(int[] A) {
        int length = A.length;
        if(length == 1){
            return A;
        }
        int max = A[0];
        int min = 0;
        int maxPos = 0;
        int minPos = 0;
        
        for(int i=1; i<length; i++){
            if(A[i-1]>A[i]){
                max = A[i-1];
                min = A[i];
                maxPos = i-1;
                minPos = i;
            }else if(max>A[i] && min<A[i]){
                min = A[i];
                minPos = i;
            }
        }
        
        if(minPos != 0){
            int temp = A[minPos];
            A[minPos] = A[maxPos];
            A[maxPos] = temp;
        }
        
        return A;
    }
}

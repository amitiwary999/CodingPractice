/*
A zero-indexed array A of length N contains all integers from 0 to N-1. Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.

Suppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.
*/




class Solution {
    public int arrayNesting(int[] A) {
        int length = A.length;
        ArrayList<Integer> found = new ArrayList(Collections.nCopies(length, null));
        int max = 0;
        for(int i=0;i<length;i++){
            int prev = A[i];
            int count = 0;
           
            while(found.get(prev) == null){
                 found.set(prev, 1);
                count++;
                prev = A[prev];
            }
            max= max(max, count);
        }
        return max;
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

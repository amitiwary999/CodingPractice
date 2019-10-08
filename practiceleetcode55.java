/*
Given an array arr that is a permutation of [0, 1, ..., arr.length - 1], we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.

What is the most number of chunks we could have made?
*/

class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0, count = 0;
        
        for(int i = 0; i < arr.length; ++i){
            count += arr[i] - i;
            ans+=(count == 0)?1:0;
        }
        
        return ans;
    }
}

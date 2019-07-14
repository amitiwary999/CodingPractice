/*
Given an array of integers, find the length of longest subsequence which is first increasing then decreasing.

**Example: **

For the given array [1 11 2 10 4 5 2 1]

Longest subsequence is [1 2 10 4 2 1]

Return value 6
*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> A) {
        int n = A.size();
        if(n==1 || n==0)
        return n;
int lis[] = new int[n];
int lds[] = new int[n];



for(int i=0;i<n;i++){
    lis[i]=1;
    lds[i]=1;
}
for(int i=1;i<n;i++){
    for(int j=0;j<i;j++){
        if(A.get(i)>A.get(j) && lis[i]<lis[j]+1)
            lis[i]=lis[j]+1;
    }
}
    
for(int i=n-2;i>=0;i--){
    for(int j=n-1;j>i;j--){
        if(A.get(i)>A.get(j) && lds[i]<lds[j]+1)
            lds[i]=lds[j]+1;
    }
}
int max=lds[0]+lis[0]-1;

for(int i=1;i<n;i++)
    if(lds[i]+lis[i]-1>max)
        max=lds[i]+lis[i]-1;
        
return max;
    }
}

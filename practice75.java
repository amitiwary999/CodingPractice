/*
Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
*/

public class Solution {
    
    public int isInterleaveUtil(String A,String B, String C, int l1,int l2,int l3,int[][] dp)
    {
        
        if(l3==0 && l1==0 && l2==0)
            return 1;
        if(l3==0)
            return 0;
        
        if(dp[l1][l2]!=-1)
            return dp[l1][l2];
        
        int result =-1;
        if(l1>=1 && A.charAt(l1-1)==C.charAt(l3-1))
            result = isInterleaveUtil(A,B,C,l1-1,l2,l3-1,dp);
        if(result==1)
            return dp[l1][l2]=result;
            
        if(l2>=1 && B.charAt(l2-1)==C.charAt(l3-1))
            result = isInterleaveUtil(A,B,C,l1,l2-1,l3-1,dp);
        if(result==1)
            return dp[l1][l2]=result;
        
        return dp[l1][l2]=0;
        
        
    }
    public int isInterleave(String A, String B, String C) {
        if(C.length()<1)
            return 1;
        
        int[][] dp  = new int[A.length()+1][B.length()+1]; 
        
        for(int i=0;i<=A.length();i++)
            for(int j=0;j<=B.length();j++)
                dp[i][j]=-1;
                
        return isInterleaveUtil(A,B,C,A.length(),B.length(),C.length(),dp);
    }
}

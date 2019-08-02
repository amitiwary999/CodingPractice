/*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.
*/

public class Solution {
    public int minCut(String A) {
        char[] ar = A.toCharArray();
        int i=0;
        int j=0;
        int size = ar.length;
        int ans=0;
        int ansb=0;
        while(i<size-1){
            j=size-1;
            int flag = i;
            int flagj=size-1;
            int tSize = 0;
            while(j>=flag){
                if(ar[j]==ar[flag]){
                    if(flag==j){
                       tSize=tSize+1; 
                    }else{
                        tSize=tSize+2;
                    }
                   flag++;j--; 
                }else{
                    flag = i;
                    j= --flagj;
                    tSize=0;
                }
            }
            i=1>tSize?i+1:i+tSize;
            if(i<size)
            ans++;
        }
        j=size-1;
        while(j>0){
            i=0;
            int flag = j;
            int flagi = 0;
            int tSize = 0;
            while(flag>=i){
                if(ar[i]==ar[flag]){
                    if(flag==i){
                       tSize=tSize+1; 
                    }else{
                        tSize=tSize+2;
                    }
                   flag--;
                   i++; 
                }else{
                    flag = j;
                    flagi++;
                    i=flagi;
                    tSize=0;
                }
            }
            
            j=1>tSize?j-1:j-tSize;
            if(j>=0)
            ansb++;
        }
        return ans>ansb?ansb:ans;
    }
}

/*
public class Solution {
    int dp[];
    public int minCut(String A) {
        if(isPalin(A))
        return 0;
        int len=A.length();
        dp=new int[len];
        for(int i=0;i<len;i++)
        dp[i]=Integer.MAX_VALUE;
        for(int i=1;i<len;i++)
        {
            String test=A.substring(0,i);
            if(isPalin(test))
            {
                int ans=1+cal(A,i);
                dp[0]=Math.min(dp[0],ans);
            }
        }
        return dp[0];
    }
    private int cal(String A,int start)
    {
        if(start>=A.length())
        return 0;
        if(isPalin(A.substring(start)))
        {
            dp[start]=0;
            return dp[start];
        }
        if(dp[start]!=Integer.MAX_VALUE)
        {
            return dp[start];
        }
        for(int i=start+1;i<A.length();i++)
        {
            String test=A.substring(start,i);
            if(isPalin(test))
            {
                int ans=1+cal(A,i);
                dp[start]=Math.min(dp[start],ans);
            }
        }
        return dp[start];
    }
    private boolean isPalin(String A)
    {
        int len=A.length();
        for(int i=0;i<len/2;i++)
        {
            if(A.charAt(i)!=A.charAt(len-i-1))
            return false;
        }
        return true;
    }
}
*/

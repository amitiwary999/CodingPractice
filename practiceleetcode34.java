/*
Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.
*/

class Solution {
    public int integerBreak(int n) {
        int[] temp = new int[n+1];
        temp[1]=1;
        int ans=0;
        for(int i=2;i<=n;i++){
            int max=0;
            for(int j=i-1;j>=(i/2);j--){
                int num1=j;
                int num2=i-j;
                
                int max1=num1*temp[num2];
                int max2=temp[num1]*num2;
                int max3=num1*num2;
                max = max(max, max(max1, max(max2, max3)));
            }
            temp[i]=max;
            ans=max(max,ans);
        }
        return ans;
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

/*
public class IntegerBreak {
    public int integerBreak(int n){
        if (n==1) return 0;
        if (n==2) return 1;
        if (n==3) return 2;
        int [] dp=new int[n+1];
        dp[2]=2;
        dp[3]=3;
        for (int i=4;i<n+1;i++){
            dp[i]=(i%3==0)?3*dp[i-3]:2*dp[i-2];
        }
        return dp[n];
    }
}
*/

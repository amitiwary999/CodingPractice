/*
You have d dice, and each die has f faces numbered 1, 2, ..., f.

Return the number of possible ways (out of fd total ways) modulo 10^9 + 7 to roll the dice so the sum of the face up numbers equals target.
*/

class Solution {
    public int numRollsToTarget(int d, int f, int target) {
     final int MOL=1000000007;
    int[][] dp = new int[target+1][d+1];
    for(int i=1;i<d+1;i++){
        for(int j=i;j<=i*f && j<=target;j++){
            if(i==1) {dp[j][i] =1;continue;}
            int num = dp[j-1][i-1];
            if(j>f) {num-=dp[j-f-1][i-1];if(num<0) num+=MOL;}
            num+=dp[j-1][i];
            while(num>MOL)
            num%=MOL;
            dp[j][i]=num;
        }
    }
        return dp[target][d];
    }
}


class Solution {
  public int numRollsToTarget(int d, int f, int target) {
    int[][] dp = new int[d][target + 1];
    for (int i = 1; i <= f; i++) if (i <= target) dp[0][i] = 1;
    for (int r = 1; r < d; r++) {
      for (int t = 1; t <= target; t++) {
          int iEnd = Math.min(t,f);
        for (int i = 1; i <= iEnd; i++) {
          if (t - i >= 0) {
            dp[r][t] += dp[r - 1][t - i];
            dp[r][t] %= 1000000007;
          }
        }
      }
    }
    return dp[d - 1][target];
  }
}

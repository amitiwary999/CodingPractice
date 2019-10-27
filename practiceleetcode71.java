/*
We partition a row of numbers A into at most K adjacent (non-empty) groups, then our score is the sum of the average of each group. What is the largest score we can achieve?

Note that our partition must use every number in A, and that scores are not necessarily integers.
*/

class Solution {
    public double largestSumOfAverages(int[] A, int K) {
        int[] sum = new int[A.length];
        double[][] dp = new double[A.length][K+1];
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            temp += A[i];
            sum[i] = temp;
        }
        for (int i = 0; i < A.length; i++) {
            dp[i][1] = 1.0 * sum[i] / (i+1);
            for (int k = 2; k <= K; k++) {
                for (int j = 0; j < i; j++) {
                    dp[i][k] = Math.max(dp[i][k], dp[j][k - 1] + 1.0 * (sum[i] - sum[j]) / (i - j));
                }
            }
        }
        return dp[A.length - 1][K];
    }
}

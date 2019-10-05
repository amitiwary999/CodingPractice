/*
Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
*/

class Solution {
    public int findLength(int[] A, int[] B) {
        int row = A.length;
        int col = B.length;
        
        int[][] lengthCount = new int[row][col];
        int ans=0;
        
        for(int i=0;i<col;i++){
            if(A[0]==B[i]){
                lengthCount[0][i]=1;
                ans=max(ans,lengthCount[0][i]);
            }
        }
        for(int i=1;i<row;i++){
            if(A[i]==B[0]){
                lengthCount[i][0]=1;
            }else{
                lengthCount[i][0]=0;
            }
             ans=max(ans,lengthCount[i][0]);
        }
        
        for(int i=1;i<row;i++){
            int found=0;
            for(int j=1;j<col;j++){
                if(A[i]==B[j]){
                   lengthCount[i][j]=lengthCount[i-1][j-1]+1;
                }else{
                    lengthCount[i][j]=0;
                }
                ans = max(ans, lengthCount[i][j]);
            }
        }
        
        return ans;
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}


/*
class Solution {
   public int findLength(int[] A, int[] B) {
        int[] dp = new int[B.length];
        
        int ans = 0;
        
        for(int j=0;j<B.length;j++){
            dp[j] = A[0] == B[j]?1:0;
            ans = Math.max(ans, dp[j]);
        }
        for(int i=1;i<A.length;i++){
            for(int j=B.length-1;j>0;j--){
                dp[j] = A[i]==B[j]?(1+dp[j-1]):0;
                ans = Math.max(ans, dp[j]);
            }
            dp[0] = A[i]==B[0]?1:0;
            ans = Math.max(ans, dp[0]);
        }
    
        return ans;
        
    }
}
*/

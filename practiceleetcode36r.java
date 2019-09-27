/*
Given an array arr of positive integers, consider all binary trees such that:

Each node has either 0 or 2 children;
The values of arr correspond to the values of each leaf in an in-order traversal of the tree.  (Recall that a node is a leaf if and only if it has 0 children.)
The value of each non-leaf node is equal to the product of the largest leaf value in its left and right subtree respectively.
Among all possible binary trees considered, return the smallest possible sum of the values of each non-leaf node.  It is guaranteed this sum fits into a 32-bit integer.
*/

class Solution {
    public int mctFromLeafValues(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];
        int[][] max = new int[arr.length][arr.length];
        for(int i = 0; i < arr.length; i ++) {
            int localMax = 0;
            for(int j = i; j < arr.length; j ++) {
                if(arr[j] > localMax) {
                    localMax = arr[j];
                }
                max[i][j] = localMax;
            }
        }
        for(int len = 1; len < arr.length; len ++) {
            for(int left = 0; left + len < arr.length; left ++) {
                int right = left + len;
                dp[left][right] = Integer.MAX_VALUE;
                if(len == 1) {
                    dp[left][right] = arr[left]*arr[right];
                } else {
                    for(int k = left; k < right; k ++) {
                        dp[left][right] = Math.min(dp[left][right], dp[left][k] + dp[k+1][right] + max[left][k]*max[k+1][right]);
                    }
                }
            }
        }
        return dp[0][arr.length-1];
    }
}
/* My Solution test logic
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int length = arr.length;
        int[] temp = new int[length];
        int[] max = new int[length];
        temp[0]=0;
        temp[1]=arr[0]*arr[1];
        max[0]=arr[0];
        max[1]=max(arr[0], arr[1]);
        for(int i=2;i<length;i++){
            int max1 = temp[i-1]+max[i-1]*arr[i];
            int max2 = temp[i-2]+(arr[i-1]*arr[i])+(max[i-2]*max(arr[i-1], arr[i]));
            System.out.println(max1+" "+max2+" "+max[i-1]+" "+max[i-2]);
            max[i] = max(max[i-1], arr[i]);
            temp[i]=min(max1, max2);
        }
        return temp[length-1];
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
    
    public int min(int num1, int num2){
        return num1<num2?num1:num2;
    }
}
*/

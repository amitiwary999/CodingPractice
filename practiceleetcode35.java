/*Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.*/

class Solution {
    public int longestPalindromeSubseq(String s) {
        int length = s.length();
        int[][] temp = new int[length][length];
        int max=1;
        for(int i=0;i<length;i++){
            temp[i][i]=1;
        }
        for(int i=1;i<length;i++){
             char c1 = s.charAt(i);
            for(int j=i-1;j>=0;j--){
                char c2 = s.charAt(j);
                if(c1==c2){
                    temp[j][i]=temp[j+1][i-1]+2;
                }else{
                   temp[j][i]= max(temp[j+1][i], temp[j][i-1]);
                }
                max=max(max, temp[j][i]);
            }
        }
        return max;
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

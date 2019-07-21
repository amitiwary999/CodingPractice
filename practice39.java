/*
Given two words A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character
*/

public class Solution {
    public int minDistance(String A, String B) {
        char[] cA = A.toCharArray();
        char[] cB = B.toCharArray();
        int size1 = cA.length;
        int size2 = cB.length;
        
        int[][] temp = new int[size1+1][size2+1];
        
        for(int i=0;i<=size1;i++){
            for(int j=0;j<=size2;j++){
                if(i==0){
                    temp[i][j]=j;
                }else if(j==0){
                    temp[i][j] = i;
                }else if(A.charAt(i-1) == B.charAt(j-1)){
                    temp[i][j] = temp[i-1][j-1];
                }else{
                    int mini = min(temp[i-1][j-1], temp[i-1][j], temp[i][j-1]);
                    temp[i][j] = 1+(mini);
                }
            }
        }
        return temp[size1][size2];
    }
    
    static int min(int A, int B, int C){
        int min = 0;
        if(A<=B && A<=C){
            min = A;
        }else if(B<=A && B<=C){
            min = B;
        }else{
            min =  C;
        }
        return min;
    }
}

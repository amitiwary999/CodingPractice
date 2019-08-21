/*
Given two sequences S, T, count number of unique ways in sequence S, to form a subsequence that is identical to the sequence T.
*/

public class Solution {
    public int numDistinct(String A, String B) {
        int sizeA = A.length();
        int sizeB = B.length();
        
        int temp[][] = new int[sizeB+1][sizeA+1];
        for(int i=0;i<sizeA+1;i++){
            temp[0][i]=1;
        }
        
        for(int i=1;i<sizeB+1;i++){
            temp[i][0] = 0;
        }
        
        for(int i=1;i<=sizeB;i++){
            char b = B.charAt(i-1);
            for(int j=1; j<=sizeA;j++){
                char a = A.charAt(j-1);
                if(a==b){
                    temp[i][j] = temp[i-1][j-1]+temp[i][j-1];
                }else{
                    temp[i][j]=temp[i][j-1];
                }
            }
        }
        return temp[sizeB][sizeA];
    }
}

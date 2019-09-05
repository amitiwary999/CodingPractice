/*Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.*/
class Solution {
    public int countSubstrings(String s) {
        char[] arrayString = s.toCharArray();
        int size = arrayString.length;
        
        int[][] isPalin = new int[size][size];
        int ans=size;
        for(int i=0;i<size;i++){
            isPalin[i][i]=1;
        }
        for(int i=2;i<=size;i++){
            for(int j=0;j<=size-i;j++){
                int flag = (j+i-1);
                if(i==2){
                    if(arrayString[j]==arrayString[flag]){
                       isPalin[j][flag]=1; 
                        ans++;
                    }
                }else{
                    if(arrayString[j]==arrayString[flag] && isPalin[j+1][flag-1]==1){
                        isPalin[j][flag]=1;
                        ans++;
                    }    
                }
            }
        }
        return ans;
    }
}

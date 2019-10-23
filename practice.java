/*
Given a string S, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.

If possible, output any possible result.  If not possible, return the empty string.
*/

class Solution {
    public String reorganizeString(String S) {
        int lenght = S.length();
        int[] alphabetCount = new int[26];
        for(int i=0 ;i<length; i++){
            char c = S.charAt(i);
               
            alphabetCount[c-97] = alphabetCount[c-97]+1;
        }
        int i=0;
        int j= 25;
        String ans = 0;
        int lengthTracked = 0;
        while(i<j){
            if(alphabetCount[i].length>0 && iTraverse<alphabetCount[i].length){
                ans = ans+String.valueOf((char)(i+97));
                iTraverse++;
                int found = 0;
                lengthTracked++;
                while(i<j){
                    if(alphabetCount[j].length>0 && jTraverse<alphabetCount[j].length){
                   ans = ans+String.valueOf((char)(j+97));
                    jTraverse++;
                        found = 1;
                        lengthTracked++;
                        break;
               }else{
                   jTraverse = 0;
                   j--;
                   continue;
              }
            }
                if(found == 0) break;
           }else{
                i++;
                iTraverse = 0;
              continue;
          }
        }
        return ans;
    }
}

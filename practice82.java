/*Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isMatch(final String A, final String B) {
        int i=A.length()-1;
        int j=B.length()-1;
        while(i>=0 && j>=0){
           if(B.charAt(j)=='*'){
           j--;
           while(A.charAt(i)==B.charAt(j) || B.charAt(j)=='.'){
              i--;
              if(i<0)return 1;
           }
           j--;
           if(j<0)return 0;
        }
        if(A.charAt(i)==B.charAt(j) || B.charAt(j)=='.'){
            i--;
            j--;
        }
        else return 0;
       }
       if(i>=0 && j<0)return 0;
       if(i<0 && j>=0)return 0;
       return 1;
    }
}

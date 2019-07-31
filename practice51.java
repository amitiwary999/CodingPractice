/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        char[] ar = A.toCharArray();
        int length = 0;
        int max = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == ' '){
                // max = length>0?length:max;
                length = 0;
            }else{
               length++;
               max = length;
            }
        }
        return max;
    }
}

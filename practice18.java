/*
Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
*/

public class Solution {
    public String reverseWords(String a) {
        String[] split = a.split(" ");
        int size = split.length;
        String ans = "";
        int flag = 0;
        for(int i=size-1; i>=0; i--){
            String temp = split[i];
            if(!temp.equals("")){
                if(flag == 0){
                    ans = ans+temp; 
                    flag = 1;
                }else{
                    ans = ans+" "+temp;
                }
            }
        }
        return ans;
    }
}


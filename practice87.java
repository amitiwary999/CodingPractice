/*Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

*/

public class Solution {
    public String longestPalindrome(String A) {
        int n = A.length();

String ans="";
 if(n==1){
    ans = ans+A.charAt(0);
    return ans;
}
for(int i=0;i<n;i++){
    int end=n-1;
    int last=n-1;
    int start = i;
    while(start<=end){
        if(A.charAt(start)==A.charAt(end)){
            start++;
            end--;
        }
        else{
            start=i;
            end = --last;
        }
    }
    
    if(last!=i){
        String s = A.substring(i,last+1);
        if(s.length()>ans.length()){
            ans = s;
        }
    }
}
if(ans.length()==0){
    ans = ans+A.charAt(0);
    return ans;
}
return ans;
    }
}

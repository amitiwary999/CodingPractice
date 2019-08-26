/*
Implement atoi to convert a string to an integer.

Example :

Input : "9 2704"
Output : 9
Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.

 Questions: Q1. Does string contain whitespace characters before the number?
A. Yes Q2. Can the string have garbage characters after the number?
A. Yes. Ignore it. Q3. If no numeric character is found before encountering garbage characters, what should I do?
A. Return 0. Q4. What if the integer overflows?
A. Return INT_MAX if the number is positive, INT_MIN otherwise. 
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int atoi(final String A) {
        String ans="";
        int x=0;
        int i=0,n=A.length();
        while(i<n && A.charAt(i)==' '){
             i++;
        }
        int f=1;
        if(i<n && A.charAt(i)=='-'){
            f=0;
            i++;
        }else if(i<n && A.charAt(i)=='+')
            i++;

        while(i<n && (A.charAt(i)<='9' && A.charAt(i)>='0')){
             ans+=A.charAt(i);
             i++;
        }
        String com1="2147483647",com2="2147483648";
        int k=0;
        while(k<ans.length() && A.charAt(k)=='0'){
            k++;
        }
        ans=ans.substring(k,ans.length());
        if(ans.length()>10){
             if(f==1)
               return Integer.MAX_VALUE;
             else
               return Integer.MIN_VALUE;
        }
        if(ans.length()==10 && ans.compareTo(com1)>0 && f==1){
              return Integer.MAX_VALUE;
        }
        if(ans.length()==10 && ans.compareTo(com2)>0 && f==0)
             return Integer.MIN_VALUE;
        for(int j=0;j<ans.length();j++){
              x=x*10+ans.charAt(j)-'0';
        }
        if(f==0)
           return -x;
        else
           return x;
    }
}

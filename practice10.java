/*
Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.
*/

public class Solution {
    public int isPalindrome(int A) {
        int divFlag = -1;
        int initDiv = 1;
        int ansFlag = 0;
        int multi = 10;
        if(A<0){
            return 0;
        }else{
            while(A != 0){
                int flag = A%10;
                A=A/10;
                ansFlag = (ansFlag*multi)+flag;
                //multi = multi*10;
            }
        }
        if(ansFlag == A){
            return 1;
        }else{
            return 0;
        }
    }
}


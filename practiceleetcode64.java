/*
Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:

Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
Paste: You can paste the characters which are copied last time.
 

Given a number n. You have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.
*/

class Solution {
    public int minSteps(int n) {
        int prev=1;
        int current=2;
        int ans=2;
        if(n==1){
            return 0;
        }else if(n==2){
            return 2;
        }else{
            while(current<n){
                if((n-current)%current == 0){
                    prev = current;
                    ans++;
                }
                current = current+prev;
                ans++;
            }
        }
        return ans;
    }
}

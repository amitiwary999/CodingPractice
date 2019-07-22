/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return 1 ( true ).

A = [3,2,1,0,4], return 0 ( false ).
*/

public class Solution {
    public int canJump(ArrayList<Integer> A) {
        int size = A.size();
        int ans[] = new int[size];
        for(int i=0; i<size-1;i++){
            ans[i] = 0;
        }
        ans[size-1] = 1;
        for(int i=size-2; i>=0;i--){
            int num = A.get(i);
            int deci = size-i-1;
            int loop = num>deci?deci:num;
            for(int j=1;j<=loop;j++){
               int temp = i+j;
               if(ans[temp] == 1){
                   ans[i] = 1;
                   break;
               }
            }
        }
        return ans[0];
    }
}

/*
A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

The function should return the number of arithmetic slices in the array A.
*/

class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int size = A.length;
        
        if(size<3)
            return 0;
        int[][] temp = new int[size][size];
        int ans=0;
        
        for(int i=2;i<size;i++){
            int diff1 = A[i-2]-A[i-1];
            int diff2 = A[i-1]-A[i];
            
            if(diff1==diff2){
                temp[i-2][i]=diff1;
                ans++;
            }else{
                temp[i-2][i]=Integer.MIN_VALUE;
            }
        }
        for(int i=4;i<=size;i++){
            for(int j=i;j<=size;j++){
                int diff1 = A[j-2]-A[j-1];
                int diff2 = temp[j-i][j-2];
                if(diff1==diff2){
                    temp[j-i][j-1]=diff1;
                    ans++;
                }else{
                    temp[j-i][j-1]=Integer.MIN_VALUE;
                }
            }
        }
        return ans;
    }
}

/*
class Solution {
public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length < 3){
            return 0;
        }
        int gap = A[1] - A[0];
        int continousArrayLength = 2;
        int result = 0;
        for(int i = 2; i < A.length; i++){
            if(A[i] - A[i - 1] == gap){
                if(++continousArrayLength >= 3){
                    result += continousArrayLength - 3 + 1;
                }
            }else{
                gap = A[i] - A[i - 1];
                continousArrayLength = 2;
            }
        }
        return result;
    }
}
*/

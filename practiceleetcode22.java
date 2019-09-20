/*
In a row of dominoes, A[i] and B[i] represent the top and bottom halves of the i-th domino.  (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)

We may rotate the i-th domino, so that A[i] and B[i] swap values.

Return the minimum number of rotations so that all the values in A are the same, or all the values in B are the same.

If it cannot be done, return -1.
*/

class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int aSize = A.length;
        int bSize = B.length;
        
        int a = A[0];
        int b = B[0];
        
        int ansAA=0;
        int ansAB=0;
        int ansBA=0;
        int ansBB=0;
        
        int canA=1;
        int canB=1;
        
        for(int i=0;i<aSize;i++){
            int aVal = A[i];
            int bVal = B[i];
            
            if(canA==0 && canB==0){
                return -1;
            }
            
            if(canA == 1 && (aVal==a || bVal==a)){
                if(aVal==a){
                    ansAA++;
                }
                if(bVal==a){
                    ansAB++;
                }
            }else{
                canA=0;
            }
            
            if(canB == 1 && (aVal==b || bVal==b)){
                if(bVal==b){
                    ansBB++;
                }
                if(aVal==b){
                    ansBA++;
                }
            }else{
                canB=0;
            }
        }
        if(canA==0 && canB==0){
            return -1;
        }else{
            return min(min(aSize-ansAA, aSize-ansAB), min(aSize-ansBB, aSize-ansBA));
            
        }
        
    }
    
    public int min(int num1, int num2){
        return num1<num2?num1:num2;
    }
}
/*
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int a = A[0], b = B[0], swapA=0, swapB=0;

        for(int i=1; i< A.length; i++){
            if(a == A[i]){
                if(b != B[i] && b != A[i]) b = -1;
            }else if(a == B[i]){
                if(b != B[i] && b != A[i]) b = -1;
            }else if(b == A[i]){
                if(a != B[i] && a != A[i]) a = -1;
            }else if(b == B[i]){
                if(a != B[i] && a != A[i]) a = -1;
            }else{ 
                a = -1;
                b = -1;
            }
            
            if(a == -1 && b == -1) return -1;
        }
        a = a==-1? b: a;
        
        for(int i=0; i< A.length; i++){
            if(A[i] == a) swapA++;
            if(B[i] == a) swapB++;
        }

        
        return swapA > swapB ? A.length -swapA: A.length -swapB;
    }
}
*/

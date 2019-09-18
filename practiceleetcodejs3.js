/*
In a row of dominoes, A[i] and B[i] represent the top and bottom halves of the i-th domino.  (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)

We may rotate the i-th domino, so that A[i] and B[i] swap values.

Return the minimum number of rotations so that all the values in A are the same, or all the values in B are the same.

If it cannot be done, return -1.
*/


/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number}
 */
var minDominoRotations = function(A, B) {
        let aSize = A.length;
        let bSize = B.length;
        
        let a = A[0];
        let b = B[0];
        
        let ansAA=0;
        let ansAB=0;
        let ansBA=0;
        let ansBB=0;
        
        let canA=1;
        let canB=1;
        
        for(let i=0;i<aSize;i++){
            let aVal = A[i];
            let bVal = B[i];
            
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
    
    function min(num1, num2){
        return num1<num2?num1:num2;
    }
};

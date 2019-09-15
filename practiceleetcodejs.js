/*
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
*/

/**
 * @param {number[]} A
 * @return {number}
 */
var numberOfArithmeticSlices = function(A) {
    var size = A.length;
    if(size<3){
        return 0;
    }
    
    let temp = new Array(size).fill(0).map(() => new Array(size).fill(0));
    let ans=0;
    let diff1, diff2;
    
    for(let i=2;i<size;i++){
        diff1 = A[i-2]-A[i-1];
        diff2 = A[i-1]-A[i];
        
        if(diff1==diff2){
            temp[i-2][i]=diff1;
            ans++;
        }else{
            temp[i-2][i]=Number.MIN_SAFE_INTEGER;
        }
    }
    
    for(let i=4;i<=size;i++){
        for(let j=i;j<=size;j++){
            diff1 = A[j-2]-A[j-1];
            diff2 = temp[j-i][j-2];
        
            if(diff1==diff2){
                temp[j-i][j-1]=diff1;
                ans++;
            }else{
                temp[j-i][j-1]=Number.MIN_SAFE_INTEGER;
            }
        }
    }
        return ans;
};

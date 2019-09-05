var minFallingPathSum = function(A) {
let row = A.length;
    let col = A.length;
    let ans = [...A[0]];
    
    for(let i=1;i<row;i++){
        let temp = new Array(col).fill(null);
        for(let j=0;j<col;j++){
            let left = j-1>=0?ans[j-1]:Infinity;
            let medium = ans[j]
            let right = j+1<col?ans[j+1]:Infinity
            
            temp[j]=A[i][j]+Math.min(left, medium, right);
        }
        ans = temp;
    }
    return Math.min(...ans);
};

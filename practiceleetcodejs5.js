/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
*/

/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
    if(m==0 || n==0){
        return 0;
    }
    
    let temp = new Array(n).fill(0).map(() => new Array(m).fill(0));
    for(let i=0;i<n;i++){
        temp[i][0]=1;
    }
    
    for(let j=0;j<m;j++){
        temp[0][j]=1;
    }
    
    for(let i=1;i<n;i++){
        for(let j=1;j<m;j++){
            temp[i][j]=temp[i-1][j]+temp[i][j-1];
        }
    }
    return temp[n-1][m-1];
};

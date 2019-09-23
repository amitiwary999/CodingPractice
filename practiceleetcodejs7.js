/*Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.*/

/**
 * @param {string} s
 * @return {number}
 */
var longestPalindromeSubseq = function(s) {
    let length = s.length;
    let ans=1;
    let temp = new Array(length).fill(0).map(()=>new Array(length).fill(0));
    for(let i=0;i<length;i++){
        temp[i][i]=1;
    }
    for(let i=1;i<length;i++){
        let c1 = s.charAt(i);
        for(let j=i-1;j>=0;j--){
            let c2 = s.charAt(j);
            if(c1==c2){
                temp[j][i]=temp[j+1][i-1]+2;
            }else{
               temp[j][i]=max(temp[j+1][i], temp[j][i-1]);
            }
            ans = max(ans, temp[j][i]);
        }
    }
    return ans;
};

function max(num1, num2){
    return num1>num2?num1:num2;
}

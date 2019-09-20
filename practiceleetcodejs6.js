/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.
*/


/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var constructMaximumBinaryTree = function(nums) {
    let length = nums.length;
    return createTree(nums, 0, length-1, length)
};

function createTree(nums, s, e, length){
    if(s<0 || e>=length || s>e){
        return null;
    }
    let pos = maxPos(nums,s,e);
    let t = new TreeNode(nums[pos]);
    let left = createTree(nums, s, pos-1, length);
    let right = createTree(nums, pos+1, e, length);
        
    t.left = left;
    t.right = right;
    return t;
}

function maxPos(nums, s, e){
    let max = Number.MIN_SAFE_INTEGER;
    let pos=s;
    for(let i=s;i<=e;i++){
        if(nums[i]>max){
            max=nums[i];
            pos=i;
        }
    }
    return pos;
}

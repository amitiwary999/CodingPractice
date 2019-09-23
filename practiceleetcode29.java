/*
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int length;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        length = nums.length;
        return createTree(nums, 0, length-1);
    }
    
    public TreeNode createTree(int[] nums, int s, int e){
        if(s<0 || e>=length || s>e){
            return null;
        }
        int pos = maxPos(nums,s,e);
        TreeNode t = new TreeNode(nums[pos]);
        TreeNode left = createTree(nums, s, pos-1);
        TreeNode right = createTree(nums, pos+1, e);
        
        t.left = left;
        t.right = right;
        return t;
    }
    
    public int maxPos(int[] nums, int s, int e){
        int max = Integer.MIN_VALUE;
        int pos=s;
        for(int i=s;i<=e;i++){
            if(nums[i]>max){
                max=nums[i];
                pos=i;
            }
        }
        return pos;
    }
}

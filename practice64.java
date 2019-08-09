/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/


/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    static int min;
    public int minDepth(TreeNode A) {
        min=Integer.MAX_VALUE;
        calMinDeep(A, 0);
        return min+1;
    }
    
    static void calMinDeep(TreeNode A, int h){
        if(A==null){
            return;
        }
        
        calMinDeep(A.left, h+1);
        calMinDeep(A.right, h+1);
        if(A.left==null && A.right == null){
            min = min<h?min:h;
        }
    }
}

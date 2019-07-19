/*
Given a binary tree, find its maximum depth.

The maximum depth of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    static int max = 0;
    public int maxDepth(TreeNode A) {
        calculate(A, 0);
        return max+1;
    }
    
    static void calculate(TreeNode A, int h){
        if(A==null){
            return;
        }
        
        calculate(A.left, h+1);
        calculate(A.right, h+1);
        if(A.left == null && A.right == null){
            if(max < h){
                max = h;
            }
        }
    }
}

/*
public class Solution {
    public int maxDepth(TreeNode A) {
     if(A==null){
            return 0;
        }
        int left = 1+maxDepth(A.left);
        int right = 1+maxDepth(A.right);
        return Math.max(left,right);
    }
}
*/

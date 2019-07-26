/*
Given a binary tree, invert the binary tree and return it. 
Look at the example for more details.
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
    public TreeNode invertTree(TreeNode A) {
        invert(A);
        return A;
    }
    
    static void invert(TreeNode A){
        if(A == null){
            return;
        }
        
        invert(A.left);
        invert(A.right);
        
        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
    }
}

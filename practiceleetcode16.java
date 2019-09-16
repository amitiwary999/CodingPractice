/*
We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
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
    public TreeNode pruneTree(TreeNode root) {
        filterTree(root);
        return root;
    }
    
    static int filterTree(TreeNode t){
        if(t==null){
            return 0;
        }
        
        int left = filterTree(t.left);
        int right = filterTree(t.right);
        
        if(left==0){
            t.left=null;
        }
        
        if(right==0){
            t.right=null;
        }
        
        return (left+right+t.val);
    }
}

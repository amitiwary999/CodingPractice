/*
Given a binary tree, find the leftmost value in the last row of the tree.
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
    int maxLeft;
    int ans;
    public int findBottomLeftValue(TreeNode root) {
        maxLeft = 0;
        ans=0;
        traverseTree(root, 0);
        return ans;
    }
    
    public void traverseTree(TreeNode t, int leftCount){
        if(t == null){
            return;
        }
        
        int count = leftCount+1;
        traverseTree(t.left, count);
        if(count>maxLeft){
            ans = t.val;
            maxLeft = count;
        }
        traverseTree(t.right, count);
    }
}

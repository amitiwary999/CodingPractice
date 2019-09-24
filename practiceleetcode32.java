/*
Given the root of a binary tree, find the maximum value V for which there exists different nodes A and B where V = |A.val - B.val| and A is an ancestor of B.

(A node A is an ancestor of B if either: any child of A is equal to B, or any child of A is an ancestor of B.)
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
    int ans;
    public int maxAncestorDiff(TreeNode root) {
        ans=0;
        traverseTree(root, root.val, root.val);
        return ans;
    }
    
    public void traverseTree(TreeNode t, int max, int min){
        if(t == null){
            return;
        }
        
        int val = t.val;
        int lMax = max;
        int lMin = min;
        
        if(val>max){
            lMax=val;
        }else if(val<min){
            lMin = val;
        }
        
        ans = max(ans, max(max-val, val-min));
        traverseTree(t.left, lMax, lMin);
        traverseTree(t.right, lMax, lMin);
    }
    
    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

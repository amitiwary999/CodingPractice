/*
Given a binary tree, find the maximum path sum.

The path may start and end at any node in the tree.
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
    public Map<TreeNode, Integer> memo[];
    public int maxVal = Integer.MIN_VALUE;
    
    public int pathSum(TreeNode cur, int hasParent) {
        if (cur == null) return 0;
        if (memo[hasParent].containsKey(cur)) 
            return memo[hasParent].get(cur);
        
        maxVal = Math.max(cur.val, maxVal);
        int lSum = pathSum(cur.left, 1);
        int rSum = pathSum(cur.right, 1);
        int res = cur.val + Math.max(lSum, rSum);
        
        if (hasParent == 0) {
            res = Math.max(res, lSum + cur.val + rSum);
            res = Math.max(res, pathSum(cur.left, 0));
            res = Math.max(res, pathSum(cur.right, 0));
        }
        
        memo[hasParent].put(cur, res);
        return res;
    }
    
    public int maxPathSum(TreeNode root) {
        memo = new HashMap[2];
        memo[0] =  new HashMap<>();
        memo[1] =  new HashMap<>();
        return ((pathSum(root, 0) == 0) ? maxVal : pathSum(root, 0));
    }
}


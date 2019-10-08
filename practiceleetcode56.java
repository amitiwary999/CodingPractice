/*
Given a binary tree rooted at root, the depth of each node is the shortest distance to the root.

A node is deepest if it has the largest depth possible among any node in the entire tree.

The subtree of a node is that node, plus the set of all descendants of that node.

Return the node with the largest depth such that it contains all the deepest nodes in its subtree.
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
    class DeepestNode {
        int depth;
        TreeNode node;

        public DeepestNode(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    DeepestNode helper(TreeNode root) {
        if (root == null)
            return new DeepestNode(0, null);

        DeepestNode l = helper(root.left), r = helper(root.right);
        int dl = l.depth, dr = r.depth;
        return new DeepestNode(Math.max(dl, dr) + 1, dl == dr ? root : dl > dr ? l.node : r.node);
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return helper(root).node;
    }
    
}

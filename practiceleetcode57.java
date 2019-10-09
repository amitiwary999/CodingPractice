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
    TreeNode ans;
    int maxHeight;
    int nodePresent;
    int nodeMaxHeight;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        ans = null;
        maxHeight = 0;
        nodePresent=0;
        nodeMaxHeight = 0;
        
        if(root.right == null && root.left == null){
            return root;
        }else{
            traverseTree(root, 0);
            return ans;
        }
    }
    
    private int traverseTree(TreeNode root, int height){
        if(root == null){
            return 0;
        }
        
        int left = traverseTree(root.left, height+1);
        int right = traverseTree(root.right, height+1);
        
        if(left == 0 && right == 0){
            if(nodePresent ==0 && height > maxHeight){
                maxHeight = height;
                ans = root;
            }
            return 1;
        }else if((left == 1 && right == 1)){
            nodePresent=1;
            if(height > nodeMaxHeight){
                nodeMaxHeight = height;
                ans = root;
            }
            return 1;
        }else{
            return 1;
        }
    }
    
}



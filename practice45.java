/*
Given a binary tree, flatten it to a linked list in-place.
*/


/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static TreeNode b=new TreeNode(-1);
    static TreeNode temp = b;
    public TreeNode flatten(TreeNode a) {
        flattenTree(a);
        return b.right;
    }
    
    static void flattenTree(TreeNode a){
        if(a==null){
            return;
        }else{
            TreeNode flag = new TreeNode(a.val);
            temp.right = flag;
            temp = temp.right;
        }
        
        flattenTree(a.left);
        flattenTree(a.right);
    }
}

/*
public class Solution {
    TreeNode root=new TreeNode(-1);
    TreeNode temp=root;
    public void preorder(TreeNode a){
       if(a==null){
          return;
        }
      temp.right=new TreeNode(a.val);
      temp=temp.right;
      preorder(a.left);
      preorder(a.right);
    }
    public TreeNode flatten(TreeNode a) {
        preorder(a);
        return root.right;
    }
    
}
*/

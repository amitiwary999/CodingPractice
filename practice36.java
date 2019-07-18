/*
inorder traversal with and without recursion
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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList();
        Stack<TreeNode> temp = new Stack();
        TreeNode flag = A;
        while(flag != null || temp.size() > 0){
            while(flag != null){
                temp.add(flag);
                flag = flag.left;
            }
            TreeNode t1 = temp.pop();
            ans.add(t1.val);
            flag = t1.right;
        }
       // inOrder(A, ans);
        return ans;
    }
    
    static void inOrder(TreeNode A, ArrayList<Integer> ans){
        if(A== null)
        return;
        
        inOrder(A.left, ans);
        ans.add(A.val);
        inOrder(A.right, ans);
    }
}

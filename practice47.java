/find maximum from root to any node

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
    static int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode A) {
        iterate(A,0);
        return max;
    }
    
    static void iterate(TreeNode A, int h){
        if(A==null){
            return;
        }
        
        iterate(A.left, (h+A.val>0?h+A.val:0));
        iterate(A.right, (h+A.val>0?h+A.val:0));
        if(A.left == null && A.right == null){
            max = max>(h+A.val)?max:(h+A.val);
        }
        System.out.println(h);
    }
}

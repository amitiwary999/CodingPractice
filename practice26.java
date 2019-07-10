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
 class SaveHeight{
     int height = 0;
 }
public class Solution {
    public int isBalanced(TreeNode A) {
        SaveHeight h = new SaveHeight();
        int ans = calculateBalance(A, h);
        return ans;
    }
    
    static int calculateBalance(TreeNode A, SaveHeight h){
        if(A== null){
            h.height = 0;
            return 1;
        }
        
        SaveHeight r = new SaveHeight();
        SaveHeight l = new SaveHeight();
        int lr = calculateBalance(A.left, l);
        int rr = calculateBalance(A.right, r);
        
        int lh=l.height;
        int rh = r.height;
        
        h.height = (lh>rh?lh:rh)+1;
        
        if((lh-rh)>=2 || (rh-lh)>=2){
            return 0;
        }
        return (lr&rr);
    }
}


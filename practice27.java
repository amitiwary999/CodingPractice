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
    public int kthsmallest(TreeNode A, int B) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        kthFind(A, num);
        return num.get(B-1);
    }
    
    static void kthFind(TreeNode A,  ArrayList<Integer> num){
        if(A==null){
            return;
        }
        
        kthFind(A.left, num);
        num.add(A.val);
        kthFind(A.right, num);
    } 
}


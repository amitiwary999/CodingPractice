/*Given a binary tree and a sum, find all root-to-leaf paths where each path’s sum equals the given sum.*/

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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        ArrayList<Integer> temp = new ArrayList();
        doWork(A,B,ans,temp,0);
        return ans;
    }
    
    static void doWork(TreeNode A, int B, ArrayList<ArrayList<Integer>> ans, 
    ArrayList<Integer> temp, int sum){
        if(A==null){
            return;
        }
        
        int val = sum+A.val;
        temp.add(A.val);
        if(val == B && (A.left ==null && A.right == null)){
            ans.add(new ArrayList<Integer>(temp));
        }
        doWork(A.left, B, ans, temp, val);
        doWork(A.right, B, ans, temp, val);
        temp.remove(temp.size()-1);
    }
}

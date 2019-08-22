/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
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
    public int isSymmetric(TreeNode A) {
        Queue<TreeNode> visit = new LinkedList();
        Stack<Integer> val = new Stack<Integer>();
        if(A!=null){
            visit.add(A);
            while(visit.size()>0){
                int size = visit.size();
                int half = size/2;
                for(int i=0; i<size; i++){
                    TreeNode t = visit.poll();
                    if(t.left!=null){
                        visit.add(t.left);
                    }
                    
                    if(t.right != null){
                        visit.add(t.right);
                    } 
                    
                    if(half>0){
                      if(i<half){
                        val.push(t.val);
                      }else{
                        if(t.val != val.pop()){
                            return 0;
                        }
                      }
                    }
                }
                if(visit.size()%2 != 0){
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }
}

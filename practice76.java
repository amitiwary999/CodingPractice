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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        Queue<TreeNode> q = new LinkedList();
        Queue<TreeNode> q1 = new LinkedList();
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        if(A!=null){
            q.add(A);
            while(q.size()>0 || q1.size()>0){
                if(q.size()>0){
                    ArrayList<Integer> temp = new ArrayList();
                    while(q.size()>0){
                        TreeNode t = q.poll();
                        if(t.left!=null){
                            q1.add(t.left);
                        }
                        
                        if(t.right != null){
                            q1.add(t.right);
                        }
                        
                        temp.add(t.val);
                    }
                    ans.add(temp);
                }else{
                   ArrayList<Integer> temp = new ArrayList();
                    while(q1.size()>0){
                        TreeNode t = q1.poll();
                        if(t.left!=null){
                            q.add(t.left);
                        }
                        
                        if(t.right != null){
                            q.add(t.right);
                        }
                        
                        temp.add(t.val);
                    } 
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}

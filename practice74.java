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
    public int t2Sum(TreeNode A, int B) {
        if(A==null){
            return 0;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap();
        q.add(A);
        while(q.size()>0){
            TreeNode t = q.poll();
            if(t.left != null){
                q.add(t.left);
            }
            if(t.right != null){
                q.add(t.right);
            }
            
            int num = t.val;
            if(num<=B){
                int temp = B-num;
                if(map.get(num)!=null){
                    return 1;
                }else{
                    map.put(temp, 1);
                }
            }
        }
        return 0;
    }
    
    
}

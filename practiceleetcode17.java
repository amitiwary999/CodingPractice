/*
Given the root of a binary tree with N nodes, each node in the tree has node.val coins, and there are N coins total.

In one move, we may choose two adjacent nodes and move one coin from one node to another.  (The move may be from parent to child, or from child to parent.)

Return the number of moves required to make every node have exactly one coin.
*/
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
    int ans;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        travserseTree(root);
        return ans;
    }

    public int travserseTree(TreeNode t) {
        if (t == null) return 0;
        int left = travserseTree(t.left);
        int right = travserseTree(t.right);
        ans += Math.abs(left) + Math.abs(right);
        int val = (t.val-1)+left+right;
        return val;
    }
}
/*I figured out above solution while implementing this
class Solution {
    static ArrayList<Integer> array;
    public int distributeCoins(TreeNode root) {
        array = new ArrayList();
        Queue<Integer> zeroM = new LinkedList();
        Stack<Integer> nonZeroM = new Stack();
        
        for(int i=0;i<array.size();i++){
            int num = array.get(i);
            if(num==0){
                if(stack.size()>0){
                    int stackNum = stack.pop();
                    
                }else{
                    queue.add(i);
                }
                
            }else{
                zeroM.size()>0
            }
            
            
        }
    
    }
    
    static int traverseTree(TreeNode t){
        if(t==null){
            return;
        }
        
        int left = traverseTree(t.left);
        int right = traverseTree(t.right);
        
        array.add(t.val);
    }
}
*/

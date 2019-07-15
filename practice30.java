/*

Given a binary tree, return the zigzag level order traversal of its nodes’ values. (ie, from left to right, then right to left for the next level and alternate between).

Example : 
Given binary tree

    3
   / \
  9  20
    /  \
   15   7
return

[
         [3],
         [20, 9],
         [15, 7]
]*/

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
    static int i=1;
    static Stack<TreeNode> treeO = new Stack<TreeNode>();
     static Stack<TreeNode> treeE = new Stack<TreeNode>();
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        treeE.add(A);
        ArrayList<Integer> a = new ArrayList();
        a.add(A.val);
        ans.add(a);
        calculateTree(A, ans);
        
        return ans;
    }
    
    static void calculateTree(TreeNode A,ArrayList<ArrayList<Integer>> ans ){
        while(treeO.size() > 0 || treeE.size() > 0){
            ArrayList<Integer> valA = new ArrayList();
        if(i%2 == 0){
            while(treeO.size() > 0){
               TreeNode temp = treeO.pop(); 
               if(temp.left != null){
                treeE.push(temp.left);
                valA.add(temp.left.val);
            }
               if(temp.right != null){
                    valA.add(temp.right.val);
                treeE.push(temp.right);
            }
            }
            i++;
            if(valA.size() > 0)
            ans.add(valA);
        }else{
            while(treeE.size() > 0){
                TreeNode temp = treeE.pop();
                if(temp.right != null){
                    valA.add(temp.right.val);
                treeO.push(temp.right);
            }
            if(temp.left != null){
                treeO.push(temp.left);
                valA.add(temp.left.val);
            }
            }
            i++;
            if(valA.size() > 0)
            ans.add(valA);
        }
        }
    }
}


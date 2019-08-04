/*
Find the lowest common ancestor in an unordered binary tree given two values in the tree.

 Lowest common ancestor : the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic graph (DAG) is the lowest (i.e. deepest) node that has both v and w as descendants. 
Example :


        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2_     0        8
         /   \
         7    4
For the above tree, the LCA of nodes 5 and 1 is 3.

 LCA = Lowest common ancestor 
Please note that LCA for nodes 5 and 4 is 5.

You are given 2 values. Find the lowest common ancestor of the two nodes represented by val1 and val2
No guarantee that val1 and val2 exist in the tree. If one value doesn’t exist in the tree then return -1.
There are no duplicate values.
You can use extra memory, helper functions, and can modify the node struct but, you can’t add a parent pointer.
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
    static int ans = -1;
    public int lca(TreeNode A, int B, int C) {
        ans = -1;
        iterate(A,B,C);
        return ans;
    }
    
    static int iterate(TreeNode A, int B, int C){
        if(A==null){
            return 0;
        }
        
        int left = iterate(A.left, B, C);
        int right = iterate(A.right, B, C);
      //  System.out.println(left+" "+right+" "+A.val+" "+A.left+" "+A.right);
        if((left == 1 && right==1) || ((A.val == B || A.val==C)&&(left==1 || right==1)) || (A.val==B && A.val ==C)){
            if(ans == -1){
                ans = A.val;
            }
            return 1;
        }else if(A.val == B || A.val==C){
            return 1;
        }else{
            return left|right;
        }
    }
}

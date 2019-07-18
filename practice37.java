/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Example :

Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem
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
    public int hasPathSum(TreeNode A, int B) {
        Integer f = 0;
        return calculate(A, B);
    }
    
    static int calculate(TreeNode A, int sum){
        if(A != null){
            int l = calculate(A.left, sum-(A.val));
            int r = calculate(A.right, sum-(A.val));
            if(A.left == null && A.right == null){
                if(sum-A.val == 0){
                    return 1;
                }else{
                  return(r | l);
            }
         }else{
           return(r | l); 
         }
        }
        return 0;
    }
}

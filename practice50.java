
Given an inorder traversal of a cartesian tree, construct the tree.
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
   
    public TreeNode buildTree(ArrayList<Integer> A) {
        return traverseTree(A, 0, A.size()-1);
    }
    
    static TreeNode traverseTree(List<Integer> A, int s, int e){
        if(s>e){
            return null;
        }else if(s==e){
            return new TreeNode(A.get(s));
        }
        int maxPos = findMax(A, s, e);
        TreeNode temp = new TreeNode(A.get(maxPos));
        temp.left = traverseTree(A, s, maxPos-1);
        temp.right = traverseTree(A,maxPos+1,e);
        return temp;
    }
    
    static int findMax(List<Integer> A, int s, int e){
        int max = A.get(s);
        int pos = s;
        for(int i=s;i<=e;i++){
            if(A.get(i) > max){
                max = A.get(i);
                pos = i;
            }
        }
        return pos;
    }
}

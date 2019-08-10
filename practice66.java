/*
Given inorder and postorder traversal of a tree, construct the binary tree.

 Note: You may assume that duplicates do not exist in the tree. 
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
    static int counter;
    public TreeNode buildTree(int[] A, int[] B) {
        int size = A.length;
        counter = size-1;
        return buildUtil(A, B, 0, size-1);
    }

    static TreeNode buildUtil(int in[], int post[], int inStrt, int inEnd)  { 
        if (inStrt > inEnd) 
            return null; 
  
        int val = post[counter];
        TreeNode node = new TreeNode(val); 
        counter--;
        if (inStrt == inEnd) 
            return node; 
  
        int iIndex = search(in, inStrt, inEnd, val); 
        node.right = buildUtil(in, post, iIndex + 1, inEnd); 
        node.left = buildUtil(in, post, inStrt, iIndex - 1); 
  
        return node; 
    } 
    
    static int search(int arr[], int strt, int end, int value){ 
        int i; 
        for (i = strt; i <= end; i++) { 
            if (arr[i] == value) 
                break; 
        } 
        return i; 
    } 
}

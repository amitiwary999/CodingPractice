/*Given preorder and inorder traversal of a tree, construct the binary tree.*/

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
    static int[] tempA, tempB;
    static int counter = 0;
    public TreeNode buildTree(int[] A, int[] B) {
        int sizeA = A.length;
        int sizeB = B.length;
        counter = 0;
        tempA = B;
        tempB = A;
        return buildProcess(0, sizeA-1);
    }
    
    static TreeNode buildProcess(int start, int end){
        if(start>end){
            return null;
        }
      //  System.out.println(counter+" "+start+" "+end);
        int num = tempB[counter];
        counter++;
        TreeNode t = new TreeNode(num);
        if(start == end){
            return t;
        }
        int pos = findPos(start, end, num);
        t.left = buildProcess(start, pos-1);
        t.right = buildProcess(pos+1, end);
        
        return t;
    }
    
    static int findPos(int start, int end, int num){
        
        for(int i=start; i<=end; i++){
            if(tempA[i] == num){
                return i;
            }
        }
        return -1;
    }
}


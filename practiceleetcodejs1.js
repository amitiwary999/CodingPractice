/*
We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
*/

/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var pruneTree = function(root) {
     traverse(root);
    return root;
    function traverse(t){
    if(t==null) return 0;
    
    var left = traverse(t.left);
    var right = traverse(t.right);
    
    if(left==0){
        t.left=null;
    }
    
    if(right==0){
        t.right=null;
    }
    
    return left+right+t.val;
}
};

/*
var pruneTree = function(root) {
     traverse(root);
    return root;
};

function traverse(t){
    if(t==null) return 0;
    
    var left = traverse(t.left);
    var right = traverse(t.right);
    
    if(left==0){
        t.left=null;
    }
    
    if(right==0){
        t.right=null;
    }
    
    return left+right+t.val;
}
*/

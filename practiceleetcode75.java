/*
Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
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
    Map<Integer, Integer> numCountMap;
    Map<Integer, ArrayList<Integer>> ansCount;
    public int[] findFrequentTreeSum(TreeNode root) {
       numCountMap = new HashMap();
        ansCount = new HashMap();
        traverseTreeForSum(root);
        int max = 1;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : ansCount.entrySet()){
            if(max < entry.getKey()){
                max = entry.getKey();
               // System.out.println(" max "+max);
            }
        }
        
        ArrayList<Integer> ansList = ansCount.get(max);
        if(ansList != null){
             int[] ansArray = new int[ansList.size()];
             for(int i=0; i<ansList.size(); i++){
                 ansArray[i] = ansList.get(i);
             }
             return ansArray;
       }else{
            return new int[0];
        }
       
    }
    
    private int traverseTreeForSum(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int left = traverseTreeForSum(node.left);
        int right = traverseTreeForSum(node.right);
        
        int sum = left+right+node.val;
        saveCount(sum);
        return sum;
    }
    
    private void saveCount(int sum){
        int count = 1;
        if(numCountMap.get(sum) != null){
            count = numCountMap.get(sum)+1;
        }
        numCountMap.put(sum, count);
        saveSum(sum, count);
    }
    
    private void saveSum(int sum, int count){
        if(ansCount.get(count) != null){
            ansCount.get(count).add(sum);
        }else{
            ArrayList<Integer> nums = new ArrayList();
            nums.add(sum);
            ansCount.put(count, nums);  
        }
    }
    
    private int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}

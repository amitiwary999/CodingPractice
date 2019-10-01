/*
We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.

Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val, and j is the smallest possible choice.  If such a j does not exist, the next larger value is 0.

Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).

Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the serialization of a linked list with a head node value of 2, second node value of 1, and third node value of 5.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList(1);
        ListNode l = head;
        while(l != null){
            list.add(l.val);
            l = l.next;
        }
        
        int size = list.size();
        int[] ans = new int[size];
        int max = list.get(0);
        ans[size-1] = 0;
        int count = 1;
        int i=0;
       while(i<size){
           int num = list.get(i);
           int found = 0;
           count = i+1;
           while(count<size){
               if(list.get(count)>num){
                   found = 1;
                   break;
               }
               count++;
           }
         
           if(found == 1){
               ans[i]=list.get(count);
           }else{
               ans[i]=0;
           }
           i++;
       }
        return ans;
    }
}

/*
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
 public int[] nextLargerNodes(ListNode head) {
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<int[]> st = new Stack<int[]>();
    	ListNode node = head;
    	int index = 0;
    	while(node != null) {
    		while(!st.isEmpty() && node.val > st.peek()[0]) {
    			int[] tmp = st.pop();
    			res.set(tmp[1], node.val);
    		}
    		st.add(new int[] {node.val, index});
    		res.add(0);
    		index++;
    		node = node.next;
    	}
    	int[] result = new int[res.size()];
    	for(int i = 0; i < result.length; i++) 
    		result[i] = res.get(i);
    	return result;
    }
}
*/

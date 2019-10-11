/*
Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.

After doing so, return the head of the final linked list.  You may return any such answer.

 

(Note that in the examples below, all sequences are serializations of ListNode objects.)
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
        public ListNode removeZeroSumSublists(ListNode head) {
        ListNode node = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int psum = 0;
        while(node!=null){
            psum = psum + node.val;
            ListNode samePSumNode = map.get(psum);
            if(psum==0 || samePSumNode!=null){ 
                ListNode temp;
                if(psum==0){ 
                    temp = head;
                    head = node.next;
                }
                else{
                    temp = samePSumNode.next;
                    samePSumNode.next = node.next;
                }
                int tsum = psum;
                while(temp.next!=node.next){
                    tsum = tsum+temp.val;
                    map.remove(tsum);
                    temp = temp.next;
                }
            }
            else{
                map.put(psum, node);
            }
            node = node.next;
        }
        return head;
    }
}

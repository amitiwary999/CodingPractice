/*

Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.
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
    public ListNode partition(ListNode head, int x) {
        if(head != null){
        int size = 0;
        ListNode end = head;
        ListNode current = head;
        ListNode flag = new ListNode(0);
        flag.next = head;
        ListNode prev=flag;
        
        while(end.next != null){
            size++;
            end = end.next;
        }
        size++;
        
        for(int i=0; i<size; i++){
            if(current.val >= x && current.next != null){
               prev.next = current.next;
                current.next = null;
                end.next = current;
                end = current;
                current = prev.next;
            }else{
                prev = current;
                current = current.next;
            }
        }
        return flag.next;
        }else{
            return null;
        }
    }
}

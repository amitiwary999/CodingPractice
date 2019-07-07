/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode newHead = A;
        if(A.next != null){
            newHead = A.next;
        A.next = newHead.next;
        newHead.next = A;
        
        ListNode prev = newHead.next.next;
        if(prev != null){
        ListNode nextN = prev.next;
        ListNode temp = A;
        
        while(prev!=null && nextN != null){
        prev.next = nextN.next;
        nextN.next = prev;
        temp.next = nextN;
        temp = prev;
        prev = prev.next;
        if(prev!=null){
        nextN = prev.next;
        }
        }
        }
        }
        
        return newHead;

     /*
      better approach

     if(A == null || A.next == null) return A;
        ListNode head = A.next, prev = null;
        while(A != null && A.next != null) {
            ListNode temp = A.next;
            A.next = A.next.next;
            temp.next = A;
            if(prev != null) prev.next = temp;
            prev = A;
            A = A.next;
            
        }
        return head;
    */
    }
}

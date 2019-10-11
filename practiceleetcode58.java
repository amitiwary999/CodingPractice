/*
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.
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
    public ListNode swapPairs(ListNode head) {
        ListNode currPairHead = head;
        ListNode prevPairTail = null;
        
        if(head == null || head.next == null){
            return head;
        }else{
            head = head.next;
        }
        while(currPairHead != null && currPairHead.next != null){
            
            ListNode elem1 = currPairHead;
            ListNode elem2 = currPairHead.next;
            
            ListNode nextPairHead = elem2.next;  
            
            elem2.next = elem1;
            
            elem1.next = nextPairHead;
            
            if(prevPairTail != null){
               prevPairTail.next = elem2;
            } 
            
            prevPairTail = elem1;
            
            currPairHead = nextPairHead;
            
        }
        
        return head;
        
    }
}

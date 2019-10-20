/*
Sort a linked list using insertion sort.

Algorithm of Insertion Sort:

Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
It repeats until no input elements remain.

Example 1:

Input: 4->2->1->3
Output: 1->2->3->4
Example 2:

Input: -1->5->3->4->0
Output: -1->0->3->4->5
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        ListNode prevTemp = head; 
        ListNode flag = new ListNode(0);
        flag.next = head;
        
        while(temp != null){
            int val = temp.val;
            
            ListNode prev = flag;
            ListNode current = flag.next;
            int found = 0;
            while(current != temp){
                if(current.val>temp.val){
                    found = 1;
                    break;
                }
                prev = current;
                current = current.next;
            }
            if(found == 1){
                prev.next = temp;
                prevTemp.next = temp.next;
                temp.next = current;
                temp = prevTemp.next;
                
            }else{
                temp = temp.next;
                prevTemp = prevTemp.next;
            }
        }
        return flag.next;
    }
}

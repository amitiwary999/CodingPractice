/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode putback(ListNode A, int k){
        ListNode head=A;
        if(head.val >k){
            head = new ListNode(k);
            head.next=A;
            A=head;
            return A;
        }
        while(head.next != null){
            if(head.next.val > k){
                ListNode temp = head.next;
                head.next = new ListNode(k);
                head.next.next = temp;
                return A;
            }
            head=head.next;
        }
        return A;
    }
    public ListNode insertionSortList(ListNode A) {
        ListNode head=A,iter2=A,iter;
        if(A.next == null)
            return A;
        while(iter2.next != null){
            if(iter2.next.val < iter2.val){
                head = putback(head,iter2.next.val);
                iter2.next = iter2.next.next;
            }else{
                iter2=iter2.next;
            }
            
        }
        return head;
    }
}



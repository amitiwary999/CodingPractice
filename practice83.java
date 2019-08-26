/*Given a singly linked list and an integer K, reverses the nodes of the

list K at a time and returns modified linked list.*/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if(B==1){
            return A;
        }
        ListNode head = new ListNode(-1);
        head.next = A;
        ListNode next = A;
        ListNode prev = head;
        ListNode fir = A;
        ListNode sec = A;
        while(sec!=null){
            fir = sec;
            sec = fir.next;
        for(int i=1;i<B;i++){
            ListNode temp = sec.next;
            sec.next = fir;
            fir = sec;
            sec = temp;
        }
        next.next = sec;
        prev.next = fir;
        
        next = sec;
        prev= fir;
        System.out.println(next.val+" "+prev.val);
        }
        return head.next;
    }
}

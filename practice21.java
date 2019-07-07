/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

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
    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode temp = A, flag, start, nextN, swap=null;
        for(int i=1;i<B-1; i++){
            if(temp.next != null){
            temp = temp.next;
            }else{
                return A;
            }
        }
        int tt = C-B;
        if(temp.next != null){
            flag = temp.next;
            start = flag;
            nextN = start.next;
            if(B==1){
                start = A;
                nextN = A.next;
                temp = A;
                flag = A;
            }
            for(int i=0; i<tt; i++){
            if(start!= null){
                if(nextN != null){
                swap = nextN.next;
                nextN.next = start;
                }
                start = nextN;
                nextN = swap;
            }
            }
            if(B == 1){
                if(swap != null){
                    temp.next = swap;
                    return start;
                }else{
                    temp.next = null;
                    return start;
                }
                }
            temp.next = start;
            flag.next = nextN;
        }else{
            return A;
        }
        return A;

      /*
      if(A==null || m==n){
            return A;
        }
        ListNode fakeHead=new ListNode(-1);
        fakeHead.next=A;
        int pos=1;
        //go m-1 places
        ListNode start=fakeHead;
        ListNode curr=A;
        while(pos<m){
            start=curr;
            curr=curr.next;
            pos++;
        }
        //reverse n posits
        ListNode prev=null;
        ListNode tail=curr;
        while(pos<=n){
            ListNode future=curr.next;
            curr.next=prev;
            prev=curr;
            curr=future;
            pos++;
        }
        start.next=prev;
        tail.next=curr;
        return fakeHead.next;
     */
    }
}


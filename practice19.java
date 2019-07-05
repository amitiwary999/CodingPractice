/*
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.
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
    public ListNode detectCycle(ListNode a) {
        ListNode nextP = a.next;
        ListNode singleSP = nextP;
        ListNode doubleSP = nextP;
        ListNode ans = null;
        if(nextP != null){
            while(doubleSP != null && doubleSP.next != null){
                singleSP = singleSP.next;
                doubleSP = doubleSP.next.next;
                
                if(singleSP == doubleSP){
                    System.out.println(doubleSP.val+"  "+singleSP.val);
                    singleSP = nextP;
                    while(singleSP != doubleSP){
                        singleSP = singleSP.next;
                        doubleSP = doubleSP.next;
                    }
                    ans = singleSP;
                    break;
                }
            }
        }
        return ans;
    }
}

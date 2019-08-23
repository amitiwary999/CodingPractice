/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.
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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode ans = new ListNode(-1);
        ListNode temp = A;
        ListNode tempB = B;
        ListNode ansFlag = ans;
        int min;
        while(temp != null && tempB!=null){
            if(temp.val> tempB.val){
                min = tempB.val;
                tempB = tempB.next;
            }else{
                min = temp.val;
                temp = temp.next;
            }
        
            ListNode flag = new ListNode(min);
            ansFlag.next = flag;
            ansFlag = ansFlag.next;
        }
        
        if(temp==null && tempB != null){
            while(tempB!=null){
                ansFlag.next = new ListNode(tempB.val);
                tempB = tempB.next;
                ansFlag = ansFlag.next;
            }
        }else if(tempB==null && temp!=null){
            while(temp != null){
            ansFlag.next = new ListNode(temp.val);
            temp = temp.next;
            ansFlag = ansFlag.next;
            }
        }
        return ans.next;
    }
    
    static int min(int num1, int num2){
        return num1>num2?num2:num1;
    }
}

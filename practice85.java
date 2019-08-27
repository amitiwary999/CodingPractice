/*
ou are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

    342 + 465 = 807
Make sure there are no trailing zeros in the output list
So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
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
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode head = new ListNode(-1);
        ListNode flag = head;
        int carry = 0;
        while(A!=null && B!=null){
            int num1 = A.val;
            int num2 = B.val;
            
            int num = num1+num2+carry;
            carry = num/10;
            int valNum = num%10;
            ListNode temp = new ListNode(valNum);
            flag.next = temp;
            flag = flag.next;
            
            A=A.next;
            B=B.next;
        }
        
       while(A!=null){
           int num = A.val+carry;
            carry = num/10;
            int valNum = num%10;
            ListNode temp = new ListNode(valNum);
            flag.next = temp;
            flag = flag.next;
            A=A.next;
       } 
       
       while(B!=null){
           int num = B.val+carry;
            carry = num/10;
            int valNum = num%10;
            ListNode temp = new ListNode(valNum);
            flag.next = temp;
            flag = flag.next;
            B=B.next;
       }
       if(carry>0){
            ListNode temp = new ListNode(carry);
            flag.next = temp;
       }
       return head.next;
    }
}

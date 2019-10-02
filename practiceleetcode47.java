/*
Given a (singly) linked list with head node root, write a function to split the linked list into k consecutive linked list "parts".

The length of each part should be as equal as possible: no two parts should have a size differing by more than 1. This may lead to some parts being null.

The parts should be in order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal parts occurring later.

Return a List of ListNode's representing the linked list parts that are formed.

Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] ans = new ListNode[k];
        ListNode t = root;
        int count = 0;
        int kTemp = 0;
        while(t != null){
            count++;
            t = t.next;
        }
        
        int div = count/k;
        int r = count%k;
        
        while(root != null){
            int end;
            if(r>0){
                end = div+1;
                r--;
            }else{
                end = div;
            }
            ListNode tempHead = new ListNode(root.val);
            ListNode ref = tempHead;
            root = root.next;
            for(int i=1;i<end;i++){
               ListNode temp = new ListNode(root.val);
                ref.next = temp;
                ref = temp;
                root = root.next;
            }
            ans[kTemp++] = tempHead;
        }
        
        for(int i=kTemp;i<k;i++){
            ans[i] = null;
        }
        return ans;
    }
}
    }
}

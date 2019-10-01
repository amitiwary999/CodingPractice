/*
We are given head, the head node of a linked list containing unique integer values.

We are also given the list G, a subset of the values in the linked list.

Return the number of connected components in G, where two values are connected if they appear consecutively in the linked list.
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
    public int numComponents(ListNode head, int[] G) {
        int gLength = G.length;
        int max = 0;
        int ans=0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<gLength;i++){
            map.put(G[i], 1);
        }
        
        int count = 0;
        while(head != null){
            int val =head.val;
            if(map.get(val) == null){
                if(count>0){
                ans++;
                count=0;
                }
            }else{
                if(head.next == null){
                    ans++;
                }
                count++;
            }
            head = head.next;
        }
        return ans;
    }
}

/*
class Solution {
    public int numComponents(ListNode head, int[] G) {
        int gLength = G.length;
        int max = 0;
        int ans=0;
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<gLength;i++){
            map.put(G[i], 1);
        }
        
        int count = 1;
        while(head != null){
            int val =head.val;
            if(map.get(val) != null){
                if(count>0){
                   ans++;
                   count=0;
                }
            }else{
                count++;
            }
            head = head.next;
        }
        return ans;
    }
}
*/

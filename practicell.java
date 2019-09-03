/*
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.
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
    public int lPalin(ListNode A) {
        int size=0;
        int flag=0;
        int ans=0;
        Queue<Integer> num = new LinkedList();
        ArrayList<Integer> nums = new ArrayList();
        while(A!=null){
            nums.add(A.val);
            A=A.next;
        }
        
        size = nums.size();
        if(size%2==0){
            flag = (size/2)-1;
        }else{
            flag = size/2;
        }
        
        for(int i=0;i<=flag;i++){
            if(nums.get(i).intValue()==nums.get(size-1-i).intValue()){
                ans++;
            }else{
                break;
            }
        }
        
        if(ans==flag+1){
            return 1;
        }else{
            return 0;
        }
    }
}

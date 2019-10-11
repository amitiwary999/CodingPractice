class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<ListNode> node = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        ListNode temp = head;
        ListNode fake = new ListNode(0);
        fake.next = head;
        int sum = 0;
        if(head == null || (head.next == null && head.val == 0)){
            return null;
        }else{
            while(temp != null){
            int val = temp.val;
            int pos = -1;
            int num=val;
            sum = sum+val;    
            for(int i=list.size()-1; i>=0;i--){
                // System.out.println(num+" i "+list.size()+" "+list.get(i)+" "+val);
                num = num+list.get(i);
                if(num == 0){
                    pos = i;
                    break;
                }
            }
            
                
            if(pos != -1){
                if(pos == 0 || sum == 0){
                    head = temp.next;
                }else{
                    node.get(pos-1).next = temp.next;
                    System.out.println(node.get(pos-1).next.val+" "+pos);
                }
            }
            list.add(val);
            node.add(temp);
            temp = temp.next;
        }
        return head;
     }
    }
}

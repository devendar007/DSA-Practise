class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        ListNode prev=slow.next=null;
        ListNode curr=head2;
        ListNode nxt=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        ListNode temp=head;
        while(prev!=null){
            ListNode temp1=temp.next;
            ListNode temp2=prev.next;
            temp.next=prev;
            prev.next=temp1;
            temp=temp1;
            prev=temp2;
        }
        
     
    }
}

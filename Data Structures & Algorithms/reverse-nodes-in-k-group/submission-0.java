class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode nxt=null;
        while(curr!=null){
         nxt=curr.next;
         curr.next=prev;
         prev=curr;
         curr=nxt;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode nxt=null;
        ListNode prev=null;
        while(temp!=null){
         ListNode t=temp;
         for(int i=1;i<k&&t!=null;i++){
          t=t.next;
         }
         if(t==null) return head;
         nxt=t.next;
         t.next=null;
         ListNode node=reverse(temp);
         if(temp==head) head=node;
         if(prev!=null) prev.next=node;
         prev=temp;
         temp.next=nxt;
         temp=nxt;
        }
        return head;
    }
}

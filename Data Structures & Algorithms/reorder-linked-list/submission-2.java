class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode nxt=head;
        ListNode prev=null;
        while(curr!=null){
       nxt=curr.next;
       curr.next=prev;
       prev=curr;
       curr=nxt;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int mid=size/2;
        for(int i=1;i<mid;i++){
            temp=temp.next;
        }
    ListNode head2=reverse(temp.next);
        temp.next=null;
        temp=head;
        ListNode ans2=new ListNode(0);
        ListNode ans=ans2;
        while(temp!=null&&head2!=null){
         ans.next=temp;
         ans=ans.next;
         temp=temp.next;
         ans.next=head2;
         head2=head2.next;
         ans=ans.next;
        }
     if(head2!=null) ans.next=head2;
    
    }
}

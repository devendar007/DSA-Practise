class Solution {
  public ListNode reverse(ListNode head){
    ListNode prev=null;
    ListNode nxt=null;
    ListNode curr=head;
    while(curr!=null){
      nxt=curr.next;
      curr.next=prev;
      prev=curr;
      curr=nxt;
    }
    return prev;

  }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevNode=null;
        ListNode nextNode=null;
     ListNode temp=head;
     while(temp!=null){
     ListNode t=temp;
     for(int i=1;i<k;i++){
      t=t.next;
         if(t==null) return head;
     }
     nextNode=t.next;
     t.next=null;
     ListNode node=reverse(temp);
    if(temp==head) head=node;
    if(prevNode!=null){

     prevNode.next=node;
    }
    temp.next=nextNode;
    prevNode=temp;
    temp=temp.next;    

     }
     return head;
    }
}

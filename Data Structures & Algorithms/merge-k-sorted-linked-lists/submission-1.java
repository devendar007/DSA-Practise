
class Solution {
    public ListNode merge(ListNode head1,ListNode head2){
      ListNode head=new ListNode(0);
      ListNode temp=head;
      while(head1!=null&&head2!=null){
        if(head1.val<=head2.val){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
        }
        else{
          temp.next=head2;
          head2=head2.next;
          temp=temp.next;
        }
      }
      if(head1!=null) temp.next=head1;
      if(head2!=null) temp.next=head2;
      return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length==0) return null;
  ListNode head=lists[0];
  for(int i=1;i<lists.length;i++){
    head=merge(head,lists[i]);
  }
  return head;
    }
}

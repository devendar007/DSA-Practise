class Solution {
    public ListNode helper(ListNode head){
        if(head==null||head.next==null) return head;
       ListNode newHead=helper(head.next);
       head.next.next=head;
       head.next=null;
       return newHead;
        
    }
    public ListNode reverseList(ListNode head) {
   return helper(head);

    }
}

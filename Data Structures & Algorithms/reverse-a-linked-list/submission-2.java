class Solution {
    public ListNode reverseList(ListNode head) {
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
}

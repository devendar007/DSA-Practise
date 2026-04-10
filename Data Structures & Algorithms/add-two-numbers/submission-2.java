class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode h2=new ListNode(0);
        ListNode temp=h2;
        int carry=0;
        while(t1!=null||t2!=null){
            int s1=t1!=null?t1.val:0;
            int s2=t2!=null?t2.val:0;
           int value=s1+s2+carry;
           ListNode node=new ListNode(value%10);
         temp.next=node;
         temp=temp.next;
         carry=value>9?1:0;
        if(t1!=null) t1=t1.next;
        if(t2!=null) t2=t2.next;

        }
        if(carry==1) {
            temp.next=new ListNode(carry);
        }
        return h2.next;
    }
}

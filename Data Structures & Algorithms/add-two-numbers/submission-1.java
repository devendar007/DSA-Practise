class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        while(carry!=0||temp1!=null||temp2!=null){
            int num1=temp1!=null?temp1.val:0;
            int num2=temp2!=null?temp2.val:0;
            int sum=num1+num2+carry;
            int rem=sum%10;
            ListNode node=new ListNode(rem);
            temp.next=node;
            temp=temp.next;
           carry=(sum)>9?1:0;
             if(temp2!=null) temp2=temp2.next;
                if(temp1!=null) temp1=temp1.next;

        }
return head.next;
    }
}

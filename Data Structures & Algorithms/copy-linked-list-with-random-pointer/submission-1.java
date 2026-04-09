class Solution {
    public Node copyRandomList(Node head) {
         Node temp=head;
         if(head==null) return head;
    // ListNode head2=new ListNode(0);
    while(temp!=null){

        Node newNode=new Node(temp.val);
        newNode.next=temp.next;
        temp.next=newNode;
        temp=newNode.next;
    }
    temp=head;
    while(temp!=null){
        if(temp.random!=null)
        temp.next.random=temp.random.next;
        temp=temp.next.next;
    }
    temp=head;
     Node t1=head;
    Node head2=head.next;
    Node t2=head2;

    while(t1!=null){
        t1.next=t2.next;
        t1=t1.next;
        if(t1!=null){
        t2.next=t1.next;
        t2=t2.next;}
    }
    return head2;
    }
}

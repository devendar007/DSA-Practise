
class Solution {
    public ListNode resolve(ListNode node1,ListNode node2){
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(node1!=null&&node2!=null){
        if(node1.val>=node2.val){
         temp.next=node2;
         temp=temp.next;
         node2=node2.next;
        }
        else{
            temp.next=node1;
            temp=temp.next;
            node1=node1.next;
        }
        }
        if(node1!=null) temp.next=node1;
        if(node2!=null) temp.next=node2;
        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
    ListNode node=lists[0];
    
    for(int i=1;i<lists.length;i++){
        node=resolve(node,lists[i]);
    }
    return node;
    }

}

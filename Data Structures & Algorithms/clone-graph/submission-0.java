class Solution {
    HashMap<Node,Node> mp=new HashMap<>();
 
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        if(mp.containsKey(node)) return mp.get(node);
       Node head=new Node(node.val);
       mp.put(node,head);
       for(Node it:node.neighbors){
        head.neighbors.add(cloneGraph(it));
       }
       return head;
    }
}
class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key,int value){
        this.key=key;
        this.value=value;
        next=prev=null;
    }
}
class LRUCache {
   int size;
  HashMap<Integer,Node> mp;
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    public LRUCache(int capacity) {
        size=capacity;
        mp=new HashMap<>();
        head.next=tail;
        tail.prev=head;
            }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            remove(node);
            add(node);
            return node.value;
        }
    return -1;


    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            node.value=value;
            remove(node);
            add(node);
            mp.put(key,node);
        
        }
        else{
            if(mp.size()==size) {
                mp.remove(tail.prev.key);
            remove(tail.prev);
          
            }
            Node node=new Node(key,value);
                  mp.put(key,node);
            add(node);
        }
        
    }
    public void add(Node node){
        head.next.prev=node;
        node.next=head.next;
      head.next=node;
      node.prev=head;
      
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

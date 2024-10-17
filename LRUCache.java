
 class Node {
     int key;
     int data;
     Node prev;
     Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class LRUCache {
    HashMap<Integer,Node> cacheMap = new HashMap<Integer,Node>();
   Node headRef=new Node(0);
    Node tailsRef=new Node(0);
    int capacity;
    public LRUCache(int capacity) {
     this.capacity=capacity;  
    headRef.next=tailsRef;
    tailsRef.prev=headRef;
    }
    
    public int get(int key) {
      if(cacheMap.containsKey(key))
      {
       Node node =cacheMap.get(key);
removeAndInsertAtRear(node);
return cacheMap.get(key).data;
      }
      return -1;
    }
    
    public void set(int key, int value) {
        
        if(!cacheMap.containsKey(key)){
            if(capacity==cacheMap.size())
            {
               Node head=headRef.next;
               headRef.next=head.next;
               head.next.prev=headRef;
               cacheMap.remove(head.key);
            }
        Node node = new Node(value);
        node.key=key;
        cacheMap.put(key,node);
      insertAtRear(node);
        }
        else
        {
            Node node=cacheMap.get(key);
         removeAndInsertAtRear(node);
         node.data=value;
        }
    }
     

    private void removeAndInsertAtRear(Node node) {
        // Remove the node
        node.prev.next = node.next;
        node.next.prev = node.prev;
        // Insert at rear
        insertAtRear(node);
    }

    private void insertAtRear(Node node) {
        node.prev = tailsRef.prev;
        node.next = tailsRef;
        tailsRef.prev.next = node;
        tailsRef.prev = node;
    }
}

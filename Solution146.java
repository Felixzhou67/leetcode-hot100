import java.util.HashMap;
import java.util.Map;

/*
ClassName:Solution146
@Author Zhou
@Create 2026/8/6 11:17
*/
class LRUCache {

    private static class Node{
        Node prev;
        Node next;
        int key;
        int value;

        Node(){

        }
        Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    Node head;
    Node tail;
    int capacity;
    int size;
    Map<Integer,Node> cache;//HashMap 不只是为了“通过 key 找到 value”，还要通过 key 直接找到该节点在双向链表中的位置。
    public LRUCache(int capacity) {
        Node listNode=new Node();
        cache=new HashMap<>();
        this.capacity=capacity;
        this.size=0;

        this.head=new Node();
        this.tail=new Node();

        head.next=tail;
        tail.prev=head;
    }
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.prev=null;
        node.next=null;
    }
    private void addToHead(Node node){
        node.next=head.next;
        head.next=node;
        node.prev=head;
        node.next.prev=node;
    }
    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }
    public int get(int key) {
        Node node=cache.get(key);
        if(node==null)return -1;
        moveToHead(cache.get(key));
        return node.value;
    }
    public void put(int key, int value) {
        Node node=cache.get(key);
        if(node!=null)
        {
            node.value=value;
            moveToHead(node);
        }else{
            Node newnode=new Node(key,value);
            cache.put(key,newnode);
           if(size<capacity)
           {
               size++;
               addToHead(newnode);
           }else{
               cache.remove(tail.prev.key);
               removeNode(tail.prev);
               addToHead(newnode);
           }
        }
    }
}

public class Solution146 {
    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);

        lRUCache.put(1, 1);
        lRUCache.put(2, 2);

        System.out.println(lRUCache.get(1)); // 1

        lRUCache.put(3, 3);

        System.out.println(lRUCache.get(2)); // -1

        lRUCache.put(4, 4);

        System.out.println(lRUCache.get(1)); // -1
        System.out.println(lRUCache.get(3)); // 3
        System.out.println(lRUCache.get(4)); // 4
    }
}

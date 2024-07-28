class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
// time complexit O(n), space complexit O(1)
public class middleNode {
    public Node middle(Node linkedList){
        Node slowNode = linkedList;
        Node fastNode = linkedList;
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Middle element is " + new middleNode().middle(head).data);
  
    }
}

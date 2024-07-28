class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class middleNodeRecusrive {
    public Node middle(Node linkedList){
        return findMiddle(linkedList, getLength(linkedList));
    }

    private int getLength(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getLength(node.next);
    }

    private Node findMiddle(Node node, int length) {
        if (length == 0 || node == null) {
            return null;
        }
        if (length == 1) {
            return node;
        }
        if (length % 2 == 0) {
            return findMiddle(node.next, length - 2);
        }
        return findMiddle(node.next, length - 2);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Middle element is " + new middleNodeRecusrive().middle(head).data);
    }
}

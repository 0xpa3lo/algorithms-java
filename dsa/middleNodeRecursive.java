import java.util.*;

// Time complexity O(n), Space complexity O(n)
class Program {
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList middleNode(LinkedList linkedList) {
    LinkedList middle = _findMiddle(linkedList, linkedList);
    return middle;
  }
  private LinkedList _findMiddle(LinkedList slowNode, LinkedList fastNode){
        if(fastNode == null || fastNode.next == null){
            return slowNode;
        }
        return _findMiddle(slowNode.next, fastNode.next.next);

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Middle element is " + new middleNode().findMiddle(head).data);
  
    }
}

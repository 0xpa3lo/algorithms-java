import java.util.*;

// Time complexity O(n) and Space complexity O(1)
class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    LinkedList first = head;
    LinkedList second = head;
    int counter = 1;
    while(second != null && counter != k) {
        second = second.next;
        counter++;
  }
    if(second == null){
      head.value = head.next.value;
      head = head.next;
    }
    while(second.next != null){
      first = first.next;
      second = second.next;
    }
    first.next = first.next.next;
  }
  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}

import java.util.*;

class Program {
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }
  // Time complexity O(m + n) where m and n are length of the lists, Space complexity O(1)
  public LinkedList mergingLinkedLists(
    LinkedList linkedListOne, LinkedList linkedListTwo
  ) {
    LinkedList pointerOne = linkedListOne;
    LinkedList pointerTwo = linkedListTwo;

    while(pointerOne != pointerTwo){
      pointerOne = (pointerOne  != null) ? pointerOne.next : pointerTwo;
      pointerTwo = (pointerTwo  != null) ? pointerTwo.next : pointerOne;
    }
    return pointerOne;
  }
}

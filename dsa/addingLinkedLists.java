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
// Time and space complexity is O(max(m, n)), where m and n are the lengths of the linked lists.
  public LinkedList addingLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo){
    LinkedList dummyLinkedList = new LinkedList(0); 
    LinkedList current = dummyLinkedList;
    int carry = 0;

    while(linkedListOne != null || linkedListTwo != null || carry != 0){
      int value1 = (linkedListOne != null) ? linkedListOne.value : 0;
      int value2 = (linkedListTwo != null) ? linkedListTwo.value : 0;
      
      int sum = value1 + value2 + carry;
      int newValue = sum % 10;
      carry =  Math.floorDiv(sum, 10);

      current.next = new LinkedList(newValue);
      current = current.next;

      linkedListOne =  (linkedListOne != null) ? linkedListOne.next : null;
      linkedListTwo =  (linkedListTwo != null) ? linkedListTwo.next : null;

    }
    return dummyLinkedList.next;
  }
}

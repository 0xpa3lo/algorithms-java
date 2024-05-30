class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

// create remove method and calculate O() and do recursively 
class LinkedList {
    Node head;

    public void insert(int data){
        head = insertRecursive(head, data);
    }
    private Node insertRecursive(Node current, int data){
        if (current == null){
            return new Node(data);

        }
        else{
            current.next = insertRecursive(current.next, data);
            return current;
        }
    }
    // update method
    public void updatNode(int oldVal, int newVal){
        if(head == null){
            return;
        }
        if(head.data == oldVal){
            head = new Node(newVal);
        }
        Node currNode = head;
        while(currNode.data != oldVal){
            currNode = currNode.next;
        }
        currNode.data = newVal;
    }

    public void updateRecursive(int oldVal, int newVal){
        if(head == null) return;
        head = _update(head, oldVal, newVal);
    }
    private Node _update(Node curr, int oldVal, int newVal){
        if(curr.data == oldVal) {
        curr.data = newVal;
        return curr;
        }
        curr.next = _update(curr.next, oldVal, newVal);
        return curr;
    }


    // remove
    public void remove(int removeVal){
        if(head == null) return;
        if (head.data == removeVal) {
            head = head.next;
            return;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data != removeVal) {
            curr = curr.next;
        }
        if(curr != null){
        curr.next = curr.next.next;
        return;
    }
        throw new IllegalArgumentException(); 
}

    public void removeRecursive(int removeVal){
        if(head == null) return;
        if(head.data == removeVal){
            head = head.next;
            return;
        }
        head = _remove(head, removeVal);
    }
    private Node _remove(Node curr, int removeVal){
        if(curr == null) { throw new IllegalArgumentException();}
        if(curr.next.data == removeVal){
            curr = curr.next.next;
            return curr;
        }
        _remove(curr.next, removeVal);
        return curr;
    }

    public void printIterative() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("None");
        System.out.println();
    }
    public void printRecursive(){
        String output = _print(head);
        System.out.println(output);
        return;
    }
    private String _print(Node curr){
        if(curr == null) {return null;}
        return curr.data + "->" + _print(curr.next);
    }


    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(1);
        list.printRecursive();
      
    }
}


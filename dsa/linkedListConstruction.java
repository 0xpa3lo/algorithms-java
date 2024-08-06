class program {
    static class Node {
        public int value;
        public Node prev;
        public Node next;
        public Node(int value){
            this.value = value;
        }
    }

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

    // Time complexity O(1) space complexity O(1)
    public void setHead(Node node){
        if(this.head == null){ 
            this.head = node;
            this.tail = node;
            return;
        }
        insertBefore(this.head, node);
    }
    // Time complexity O(1) space complexity O(1)
    public void setTail(Node node){
        if(this.head == null){
            setHead(node);
            return;
        }
        insertAfter(this.tail, node);
    }

    public void addNode(Node node){
        setTail(node);
    }

    public void printForward() {
        Node curr = this.head;
        while(curr != null){
            System.out.print(curr.value + "-");
            curr = curr.next;
        }
    }
    // Time complexity O(1) space complexity O(1)
    public void insertBefore(Node node, Node nodeToInsert){
        if(nodeToInsert == this.head && nodeToInsert == this.tail){
            return;
        }
        remove(nodeToInsert);
        nodeToInsert.prev = node.prev;
        nodeToInsert.next = node;
        if(node.prev == null){
            this.head = nodeToInsert;
        }
        else{
            node.prev.next = nodeToInsert;
        }
        node.prev = nodeToInsert;
    }

    // Time complexity O(1) space complexity O(1)
    public void insertAfter(Node node, Node nodeToInsert){
        if(nodeToInsert == this.head && nodeToInsert == this.tail){
            return;
        }
        remove(nodeToInsert);
        nodeToInsert.prev = node;
        nodeToInsert.next = node.next;
        if(node.next == null){
            this.tail = nodeToInsert;
        }
        else{
            node.next.prev = nodeToInsert;
        }
        node.next = nodeToInsert;
    }
    // Time complexity O(n) space complexity O(1) 
    public void insertAtPosition(int position, Node nodeToInsert){
        if(position == 1){
            setHead(nodeToInsert);
            return;
    }
        Node curr = this.head;
        int currentPostion = 1;
        while(curr != null && currentPostion != position){
            curr = curr.next;
            currentPostion++;
        }
        if(curr != null){
            insertBefore(curr, nodeToInsert);
        }
        else{
            setTail(nodeToInsert);
        }
    }
    // time complexity O(n) space complexity O(1)
    public void removeNodesWithValue(int value){
        Node curr = this.head;
        while(curr!= null){
            Node nodeToremove = curr;
            curr = curr.next;
            if(nodeToremove.value == value){this.remove(nodeToremove);}
        }
    }
    // time complexity O(1) space complexity O(1) 
    public void remove(Node node) {
        if(this.head == node){
            this.head = this.head.next;
        }
        if(this.tail == node){
            this.tail = this.tail.prev;
        }
        removeNodeBindings(node);
    }
    // time complexity O(n) space complexity O(1) - search
    public boolean containsNodeWithValue(int value){
        Node curr = this.head;
        while(curr != null && curr.value != value){
            curr = curr.next;
        }
        return curr != null;
    }

    public void removeNodeBindings(Node node){
        if(node.prev != null){
        node.prev.next = node.next;
        }
        if(node.next != null){
            node.next.prev = node.prev;
        }
        node.prev = null;
        node.next = null;
    }
    
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        linkedList.addNode(one);
        linkedList.addNode(two);
        linkedList.addNode(three);
        linkedList.printForward();
    }
}
}

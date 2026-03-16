package LinkedList;

class Node{
    int val;
    Node next;

    public Node(){}

    public Node(int val){
        this.val = val;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

}

class LinkedList{

    Node head;
    Node tail = null;;
    int size = 0;

    public void addFirst(int val){
        
        if(head == null){
            Node node = new Node();
            head = node;
            tail = head;
        }

        Node node = new Node();
        node.next = head;
        head = node;
        size++;
    }
}



class OptimizedSingleLinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
    }
}
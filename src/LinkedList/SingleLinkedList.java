package LinkedList;

class Node{
    int val;
    Node next;
    Node head;

    public Node(){}

    public Node(int val){
        this.val=val;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    public void addFirst(int val){

        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void addLast(int val){
        Node curr = head;
        Node temp = null;
        while(curr != null){
            temp = curr;
            curr = curr.next;
        }
        Node newNode = new Node(val);
        temp.next=newNode;
    }

    public void insertAt(int val, int index){
        Node curr = head;
        Node temp = curr;
        for(int i=0; i<index; i++){
            temp = curr;
            curr =  curr.next;
        }

        Node newNode = new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        Node temp = head;
        head=temp.next;
        return temp.val;
    }

    public int removeLast(){
        Node curr = head;
        Node temp = null;
        int x = 0;
        while(curr.next != null){
            temp = curr;
            curr = curr.next;
            x = curr.val;
        }
        
        temp.next = null;
        return x;
    }

    public int removeAt(int index){
        int x = 0;
        Node curr = head;
        Node temp = null;

        for(int i=0; i<index;i++){
            temp = curr;
            curr = curr.next;
            x = temp.val;
        }

        temp.next = curr.next;

        return x;
    }
}




class SingleLinkedList{
    public static void main(String args[]){
        Node node = new Node();

        node.display();

        node.addFirst(10);
        node.addFirst(20);
        node.addFirst(40);
        node.addFirst(50);
        node.addFirst(70);
        node.display();

        node.addLast(0);
        node.addLast(-10);
        node.addLast(-40);
        node.addLast(-20);
        node.addLast(-50);
        
        node.display();

        node.insertAt(60,1);
        node.display();

        node.insertAt(30,4);
        node.display();

        System.out.println("Removed Element at start is: "+node.removeFirst()); // prints the value
        node.display();

        System.out.println("Removed Element at end is: "+node.removeLast()); // prints the value
        node.display();
        
        System.out.println("Removed Element at index is: " + node.removeAt(8)); // prints the value
        node.display();
    }
}
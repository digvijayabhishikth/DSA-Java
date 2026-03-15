package LinkedList;

import java.awt.HeadlessException;

class Node{
    int val;
    Node next;

    public Node(){}

    public Node(int val){
        this.val=val;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

}

class LinkedList{
    Node head;

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
        System.out.println("End");
    }

    public void addLast(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next=newNode;
    }

    public void insertAt(int val, int index){

        if(index == 0){
            addFirst(val);
            return;
        }

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

        if(head == null)
            return -1;

        if(head.next == null){
            int val = head.val;
            head = null;
            return val;
        }
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

        if(index == 0)
            return removeFirst();

        Node curr = head;

        for(int i=0; i<index-1;i++){
            curr = curr.next;
        }

        int val = curr.next.val;
        curr.next = curr.next.next;

        return val;
    }

    public int getFirst(){
        return head.val;
    }

    public int getLast(){
        Node curr = head;
        Node temp = null;
        while(curr != null){
            temp = curr;
            curr = curr.next;
        }
        return temp.val;
    }

    public int getAt(int index){
        Node curr = head;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        return curr.val;
    }

    public int size(){
        int size=0;
        Node curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public boolean contains(int val){
        Node curr = head;
        while(curr != null){
            if(curr.val == val)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public int find(int val){
        Node curr = head;
        int index = 0;
        while(curr != null){
            if(curr.val == val){
                return index;
            }
            index++;
            curr=curr.next;
        }
        return -1;
    }

    public void reverse(){

        Node prev =  null;
        Node curr = head;

        while(curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

}

class SingleLinkedList{
    public static void main(String args[]){
        LinkedList node = new LinkedList();

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
        
        System.out.println("First Element is / Head Element is : " + node.getFirst()); // prints the value
        System.out.println("Last Element is: " + node.getLast()); // prints the value
        System.out.println("Element at index 4 is: " + node.getAt(4)); // prints the value
        System.out.println("Size of the Linked List is: " + node.size()); // prints the value
        System.out.println("Is Linked List empty? " + node.isEmpty()); // prints the value
        System.out.println("100 is present in LinkedList " + node.contains(100)); // prints the value
        System.out.println("50 is present in LinkedList " + node.contains(50)); // prints the value
        System.out.println("30 is present in LinkedList at index: " + node.find(30)); // prints the value

        node.reverse();
        node.display();
    }
}
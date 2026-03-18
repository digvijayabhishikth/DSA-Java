package OprimizedSingleLinkedList;

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
            Node node = new Node(val);
            head = node;
            tail = head;
            size++;
            return;
        }
        
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    public void addLast(int val){

        if(head == null){
            Node node = new Node(val);
            head = node;
            tail = head;
            size++;
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void display(){

        Node curr = head;
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        while(curr!= null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.println(" End");

    }

    public void insertAt(int val, int index){
        if(index==0){
            addFirst(val);
            return;
        }

        if(index==size){
            addLast(val);
            return;
        }

        Node curr = head;
        Node temp = null;
        for(int i=0;i<index;i++){
            temp = curr;
            curr=curr.next;
        }

        Node node = new Node(val);
        node.next = curr;
        temp.next = node;

        size++;
    }

    public int getFirst(){
        if(head==null){
            System.out.println("Linkedlist is Empty");
            return -1;
        }
        return head.val;
    }
    
    public int getLast(){
        if(head==null){
            System.out.println("Linkedlist is Empty");
            return -1;
        }
        return tail.val;
    }

    public int getAt(int index){

        if(size == 0 || head == null){
            System.out.println("Linkedlist is Empty");
            return -1;
        }

        if(index>=size || index < 0){
            System.out.println("index is outside the boundaries of linkedlist");
            return -1;
        }
        if(index == 0){
            return head.val;
        }
        if(index == size-1){
            return tail.val;
        }
        if(index == 1){
            return head.next.val;
        }
        Node curr = head;

        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }

   public void removeFirst(){

        if(head == null) return;

        Node curr = head;
        head = curr.next;
        size--;
   } 

   public void removeLast(){

        if(size == 1){
            head = null;
            tail = null;
        }

        Node curr = head;
        while(curr.next != tail){
            curr=curr.next;
        }
        curr.next = null;
        tail = curr;
        size--;
   }

   public void removeAt(int index){

        if(size == 0 || head == null){
            System.out.println("Linkedlist is Empty");
            return;
        }

        if(index>=size || index<0){
            System.out.println("index is outside the boundaries of linkedlist");
            return;
        }

        if(index == 0){
            removeFirst();
            return;
        }

        if(index == size-1){
            removeLast();
            return;
        }

        Node curr = head;
        Node temp = null;
        for(int i=0;i<index;i++){
            temp = curr;
            curr=curr.next;
        }

        temp.next = curr.next;
        curr.next=null;

        size--;
        
   }

   public void reverse(){
    Node curr = head;
    Node prev = null;
    while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    tail = head;
    head = prev;
   }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(int val){
        Node curr = head;
        while(curr!=null){
            if(curr.val == val)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public int find(int val){
        Node curr = head;
        int index = 0;
        while(curr!=null){
            if(curr.val == val)
                return index;
            index++;
            curr = curr.next;
        }

        return -1;
    }

    // public void sort(){
    //     Node curr1 = head;
    //     while(curr1 != null){

    //         Node curr2 = curr1.next;

    //         while(curr2 != null){
    //             if(curr1.val > curr2.val){
    //                 Node temp = curr1;
    //                 temp.next = curr2.next;
    //                 curr2.next = curr1;
    //                 curr1.next = temp.next;
    //             }
    //             curr2 = curr2.next;
    //         }
    //         curr1 = curr1.next;
    //     }
    // }
}


class OptimizedSingleLinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        System.out.println(ll.isEmpty());
        ll.addFirst(10);
        ll.addFirst(20);
        ll.display();


        ll.addLast(30);
        ll.display();
        
        ll.insertAt(0,2);
        ll.insertAt(30,0);
        ll.insertAt(20,5);
        
        ll.display();

        System.out.println("Size of the Linked List is: "+ll.size());
        System.out.println("Is linked list empty? : "+ll.isEmpty());

        System.out.println("Linkedlist contains 30: "+ll.contains(30));
        System.out.println("Linkedlist contains 50: "+ll.contains(50));
        
        System.out.println("Linkedlist has 10 at index: "+ll.find(10));
        System.out.println("First Element in Linkedlist is: "+ll.getFirst());
        System.out.println("Last Element in Linkedlist is: "+ll.getLast());

        ll.display();
        System.out.println("Element at index 4 is: "+ll.getAt(4));

        ll.removeFirst();
        ll.display();

        ll.removeLast();
        ll.display();

        ll.removeAt(2);
        ll.display();

        System.out.println("reverse of the ll is:");
        ll.reverse();
        ll.display();

        System.out.println("Sorted ll is:");
        ll.sort();
        ll.display();

    }
}
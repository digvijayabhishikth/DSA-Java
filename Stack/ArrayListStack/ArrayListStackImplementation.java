package ArrayListStack;

import java.util.*;

class ArrayListStack{

    ArrayList<Integer> al = new ArrayList<>();

    void push(int x){
        try{
            al.add(x);
        }
        catch(OutOfMemoryError e){
            System.out.println("Stack Overflow: Memory Full");
        }
    }

    int pop(){
        if(al.size() == 0){
            System.out.println("Stack is Empty");
            System.out.println("This is underflow");
            return 0;
        }
        int x = al.get(al.size()-1);
        al.remove(al.size()-1);
        return x;
    }

    int peek(){
        if(al.size() == 0){
            System.out.println("Stack is Empty");
            System.out.println("This is underflow");
            return 0;
        }
        return al.get(al.size()-1);
    }

    int size(){
        if(al.size() == 0){
            System.out.println("Stack is Empty");
            return 0;
        }
        return al.size();
    }

    boolean isEmpty(){
        if(al.size() == 0){
            System.out.println("Stack is Empty");
        }
        return (al.size()-1==0);
    }

    void printStack(){
        if(al.size() == 0){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements");
        for(int x:al){
            System.out.print(x+" ");
        }
        System.out.println();
    }

}

public class ArrayListStackImplementation {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        ArrayListStack s = new ArrayListStack();

        boolean running = true;

    while(running){
        System.out.println("Operation: \n 1.Size of the Stack \n 2.Push an Element \n 3.Pop an Element \n 4.the top element in the Stack \n 5.is Stack Empty \n 6. Print the Stack \n 7. Exit");
        System.out.println("Choose an Operation and Enter the number: ");
        int op = sc.nextInt();

        switch(op){
            case 1: System.out.println("The size of stack is: "+ s.size());
                    break;
            case 2:
                    System.out.println("Enter an element to push into the stack: ");
                    int x = sc.nextInt();
                    s.push(x);
                    break;
            case 3: System.out.println("The popped Element is : "+s.pop());
                    break;
            case 4: System.out.println("the Top Element: " + s.peek());
                    break;
            case 5: System.out.println("Is Stack Empty: "+s.isEmpty());
                    break;
            case 6: s.printStack();
                    break;
            case 7: running = false;
                    System.out.println("Exit");
                    break;
            default:  System.out.println("Invalid operation! Please choose between 1-6.");
        }
    }
    sc.close();
    }
}

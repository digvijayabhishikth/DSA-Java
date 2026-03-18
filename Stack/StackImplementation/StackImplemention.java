package StackImplementation;

import java.util.*;
class Stack{

    int size;
    int arr[];
    int top;

    Stack(int size){
        this.top = -1;
        this.size = size;
        arr = new int[size];
    }

    void push(int x){

        if(top == arr.length-1){
            System.out.println("Stack is full");
            System.out.println("This is Overflow");
            return;
        }

        top++;
        arr[top] = x;
        System.out.println(x + " pushed into stack");
    }

    int pop(){

        if(top == -1){
        System.out.println("Stack is empty");
        System.out.println("This is Underflow");

        return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int size(){
        return top+1;
    }

    boolean isempty(){

        return (top == -1);
    }

    void printStack(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack Elements: ");
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

}

class StackImplemention {

public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    
    System.out.println("Enter the size of Stack: ");
    int sizeOfStack = sc.nextInt();

    Stack s = new Stack(sizeOfStack);

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
            case 5: System.out.println("Is Stack Empty: "+s.isempty());
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


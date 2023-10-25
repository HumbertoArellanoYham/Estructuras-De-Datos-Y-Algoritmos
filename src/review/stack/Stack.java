package review.stack;

import stack.MyStackExceptionRuntime;
import stack.Node;

/*A stack contains 4 methods for su implementation
* 1.- pop
* 2.- Push
* 3.- Peek
* 4.- isEmpty*/

public class Stack {
    private Node top;

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        int topValue = peek();
        top = top.next;

        return topValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new MyStackExceptionRuntime("The Stack is empty");
        }

        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printAllToEliminate(){
        Node current = top;

        try {
            while (current.next != null) {
                System.out.println(pop());
            }

            System.out.println(pop());
        } catch (MyStackExceptionRuntime e){
            System.out.println(e.getMessage());
        }
    }
}

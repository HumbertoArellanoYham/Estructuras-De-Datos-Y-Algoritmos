package implementations.stacks;

import examples.MyStackExceptionRuntime;

public class Stack {
    private Node top;

    public void push(int value){
        Node newTop = new Node(value);
        if(top == null){
            top = newTop;
            return;
        }

        top = newTop;
        newTop.next = top;
    }

    public int pop(){
        int valueOfTheNodeDelete = peek();
        top = top.next;

        return valueOfTheNodeDelete;
    }

    public int peek(){
        if(isEmpty()){
            throw new MyStackExceptionRuntime("The stack is empty");
        }

        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }
}

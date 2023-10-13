package queue;

import stack.MyStackExceptionRuntime;

public class Queue {
    private Node first;
    private Node last;

    public void add(int value){
        Node newLast = new Node(value);

        if(last != null){
            last.next = last;
        }

        last = newLast;

        if(first == null){
            first = newLast;
        }
    }

    public int remove(){
        int firstValue = peek();
        first = first.next;

        if(first == null){
            last = null;
        }

        return firstValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new MyStackExceptionRuntime("The stack is empty");
        }

        return first.value;
    }

    public boolean isEmpty(){
        return first == null;
    }
}

package implementations;

import examples.MyStackExceptionRuntime;

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
        int valueDeleteNode = peek();
        first = first.next;

        if(first == null){
            last = null;
        }

        return valueDeleteNode;
    }

    public int peek(){
        if(isEmpty()){
            throw new MyStackExceptionRuntime("The queue is empty");
        }

        return first.value;
    }

    public boolean isEmpty(){
        return first == null;
    }
}

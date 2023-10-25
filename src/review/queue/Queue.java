package review.queue;

import review.Node;
import review.stack.MyStackExceptionRuntime;

public class Queue {
    private Node last;
    private Node first;

    public void add(int value){
        Node newLast = new Node(value);

        if(last != null){
            last.next = newLast;
        }

        last = newLast;

        if(first == null){
            first = newLast;
        }
    }

    public int remove(){
        int reference = peek();
        first = first.next;

        if(first == null)
            last = null;

        return reference;
    }

    public int peek(){
        if(isEmpty())
            throw new MyStackExceptionRuntime("The queue is empty");

        return first.value;
    }

    public boolean isEmpty(){
        return first == null;
    }
}

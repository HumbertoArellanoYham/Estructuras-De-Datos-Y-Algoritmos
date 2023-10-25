package examples;

public class Stack {
    private Node top;
    private static int sizeStack;

    public void push(int value){
        Node newTop = new Node(value);

        newTop.next = top;
        top = newTop;

        sizeStack++;
    }

    public int pop(){
        int topValue = peek();
        top = top.next;

        sizeStack--;

        return topValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new MyStackExceptionRuntime("La stack esta vacia");
        }

        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return sizeStack;
    }
}
